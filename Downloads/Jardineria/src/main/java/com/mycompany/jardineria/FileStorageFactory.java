/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
public class FileStorageFactory<K> implements StorageFactory<K> {
    private final String filePath; // Almacena la ruta del archivo donde se guardarán los datos

    public FileStorageFactory(String filePath) {
        this.filePath = filePath; // Inicializa la ruta del archivo en el constructor
    }

    @Override
    public void save(String tableName, String[] columns, K[] values) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Abre un BufferedWriter para escribir en el archivo especificado
            // El parámetro 'true' en el constructor indica que se agregará texto al final del archivo si este existe

            StringBuilder data = new StringBuilder(); // Crea un StringBuilder para construir la cadena de datos a guardar
            for (K value : values) {
                data.append(value.toString()).append(","); // Convierte cada valor a cadena y los agrega a data, separados por comas
            }
            data.deleteCharAt(data.length() - 1); // Elimina la última coma de la cadena de datos

            writer.write(data.toString()); // Escribe la cadena de datos en el archivo
            writer.newLine(); // Agrega una nueva línea al final del archivo

        } catch (IOException ex) { // Captura cualquier excepción de E/S que pueda ocurrir durante la escritura en el archivo
            Logger.getLogger(FileStorageFactory.class.getName()).log(Level.SEVERE, null, ex); // Registra la excepción en el registro de errores
        }
    }
}

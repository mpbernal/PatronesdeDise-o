/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author johan
 */
public class DatabaseStorageFactory <K> implements StorageFactory<K> {
    private final Connection connection;

    public DatabaseStorageFactory(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(String tableName, String[] columns, K[] values) throws SQLException {
           StringBuilder query = new StringBuilder("INSERT INTO " + tableName + " (");
        for (String column : columns) {
            query.append(column).append(", "); // Agrega los nombres de las columnas a la consulta
        }
        query.delete(query.length() - 2, query.length()).append(") VALUES ("); // Elimina la coma extra y añade los valores a la consulta
        for (K value : values) {
            query.append("?, "); // Agrega placeholders para los valores
        }
        query.delete(query.length() - 2, query.length()).append(")"); // Elimina la coma extra y completa la consulta
        System.out.println(query.toString());
        // Ejecuta la consulta preparada con los valores
        try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
            for (int i = 0; i < values.length; i++) {
                statement.setObject(i + 1, values[i]); // Asigna los valores a los placeholders en la consulta
            }
            statement.executeUpdate(); // Ejecuta la consulta para insertar los datos en la base de datos
        }
        }
    }


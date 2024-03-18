/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDAbstracto<K>{

    private Connection connection;
    private String filePath;
    private String nombreArchivo;
    // Constructor que recibe una conexión a la base de datos
    public CRUDAbstracto(Connection connection) {
        this.connection=connection;
    }
    
    public void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para crear registros en la base de datos
    public void create(String tableName, String[] columns, K[] values) throws SQLException {
     System.out.println("¿Desea guardar en un archivo de texto o en la base de datos?");
        System.out.println("1. Archivo de texto");
        System.out.println("2. Base de datos");
        
        
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
       scanner.nextLine();
        switch (option) {
            case 1:
                System.out.println(" ingresa nombre de archivo ");
                filePath ="C:\\Users\\Public\\Documents\\";
                nombreArchivo = scanner.nextLine();
                filePath=filePath+nombreArchivo+".txt";
                FileStorageFactory fileStorageFactory = new FileStorageFactory<>(filePath);
                fileStorageFactory.save(tableName, columns, values);
                break;
            case 2:
                DatabaseStorageFactory databaseStorageFactory = new DatabaseStorageFactory<>(connection);
                 databaseStorageFactory.save(tableName, columns, values);
                break;
            default:
                System.out.println("Opción no válida. No se guardará nada.");
        }
    }

    // Método para leer registros de la base de datos
    public ResultSet read(String tableName) throws SQLException {
        String query = "SELECT * FROM " + tableName; // Construye la consulta SELECT
        PreparedStatement statement = connection.prepareStatement(query); // Prepara la consulta
        return statement.executeQuery(); // Ejecuta la consulta y devuelve el resultado
    }

    // Método para actualizar registros en la base de datos
    public void update(String tableName, String[] columns, K[] values, String condition) throws SQLException {
        StringBuilder query = new StringBuilder("UPDATE " + tableName + " SET ");
        for (String column : columns) {
            query.append(column).append(" = ?, "); // Agrega los nombres de las columnas y placeholders para los nuevos valores
        }
        query.delete(query.length() - 2, query.length()).append(" WHERE ").append(condition); // Completa la consulta con la condición de actualización

        // Ejecuta la consulta preparada con los nuevos valores
        try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
            int parameterIndex = 1;
            for (Object value : values) {
                statement.setObject(parameterIndex++, value); // Asigna los nuevos valores a los placeholders en la consulta
            }
            statement.executeUpdate(); // Ejecuta la consulta para actualizar los datos en la base de datos
        }
    }

    // Método para eliminar registros de la base de datos
    public void delete(String tableName, String condition) throws SQLException {
        String query = "DELETE FROM " + tableName + " WHERE " + condition; // Construye la consulta DELETE
        PreparedStatement statement = connection.prepareStatement(query); // Prepara la consulta
        statement.executeUpdate(); // Ejecuta la consulta para eliminar los datos de la base de datos
    }
}

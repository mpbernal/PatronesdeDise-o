/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDAbstracto<K>{

    private Connection connection;

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

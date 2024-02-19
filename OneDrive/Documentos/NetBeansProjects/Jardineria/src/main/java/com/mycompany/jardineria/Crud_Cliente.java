/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Crud_Cliente<T> {

    private Connection connection;
    
    public Crud_Cliente() {
        Conexion_basededatos conectar = new Conexion_basededatos();
        connection = conectar.establecerConexion();
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

     public List<Cliente> obtenerTodosLosPaises() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");

            while (resultSet.next()) {
                Cliente cliente = new Cliente(resultSet.getInt("codigo_cliente"), resultSet.getString("nombre_cliente"));
                // Puedes añadir más atributos según la estructura de tu tabla
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
public void crearCliente(Cliente cliente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cliente (nombre_cliente) VALUES (?)");
            preparedStatement.setString(1, cliente.getNombre_cliente());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 public void editarCliente(Cliente cliente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE cliente SET nombre_cliente = ? WHERE codigo_cliente = ?");
            preparedStatement.setString(1, cliente.getNombre_cliente());
            // Puedes añadir más atributos según la estructura de tu tabla
            preparedStatement.setInt(2, cliente.getCodigo_cliente());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
 public void eliminarcliente(int codigo_cliente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM cliente WHERE codigo_cliente = ?");
            preparedStatement.setInt(1, codigo_cliente);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    

    
}
    


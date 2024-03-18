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
 * @author johan
 */
public class CrudDetalle_pedido<T> {
    private Connection connection;
    
    public CrudDetalle_pedido() {
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

     public List<Detalle_pedido> obtenerTodoslosPedidos() {
        List<Detalle_pedido> detalle_pedidos = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM detalle_pedido");

            while (resultSet.next()) {
                 Detalle_pedido detalle_pedido = new Detalle_pedido(resultSet.getInt("codigo_pedido"), resultSet.getString("codigo_producto"), resultSet.getInt("cantidad"));
                // Puedes añadir más atributos según la estructura de tu tabla
                detalle_pedidos.add(detalle_pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalle_pedidos;
    }
public void crearDetallePedido(Detalle_pedido detalle_pedido) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO detalle_pedido (codigo_pedido) VALUES (?)");
            preparedStatement.setInt(1,detalle_pedido.getCodigo_pedido());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 public void editarPedido(Detalle_pedido detalle_pedido) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE detall_pedido SET codigo_pedido = ? WHERE codigo_producto = ?");
            preparedStatement.setInt(1, detalle_pedido.getCodigo_pedido());
            // Puedes añadir más atributos según la estructura de tu tabla
            preparedStatement.setString(2, detalle_pedido.getCodigo_producto());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
 public void eliminarPedido(int codigo_pedido) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM detalle_pedido WHERE codigo_pedido = ?");
            preparedStatement.setInt(1, codigo_pedido);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




  


    
}
    


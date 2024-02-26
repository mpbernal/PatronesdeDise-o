/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ConexionBasededatos {
    
    Connection conectar  = null;
    String usuario= "root";
    String contraseña= "";
    String bd= "jardineria";
    String ip= "localhost";
    String puerto= "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito");
          
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return conectar;
    }
    
}

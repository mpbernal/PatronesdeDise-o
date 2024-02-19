/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Conexion_basededatos {
    
    Connection conectar  = null;
    String usuario= "root";
    String contraseña= "";
    String bd= "Jardineria";
    String ip= "localhost";
    String puerto= "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito");
          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos"+e.toString());
        }
        return conectar;
    }
    
}

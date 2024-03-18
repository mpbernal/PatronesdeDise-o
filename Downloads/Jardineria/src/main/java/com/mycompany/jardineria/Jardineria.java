    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jardineria;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class Jardineria {

    public static void main(String[] args) throws SQLException   {
   
        Conexion_basededatos  connection = new Conexion_basededatos();

        CRUDAbstracto crud = new CRUDAbstracto(connection.establecerConexion());
        Cliente nuevoCliente = new Cliente();
        String temp = "48,Prueba,Johan,Duarte,322879546,3222685964,calle 11,NULL,Bogota,Colombia,66001,3    0,5451515";
        String[] valores = temp.split(",");
       
        crud.create("Cliente",nuevoCliente.camposSeparados ,valores);
        crud.cerrarConexion();

    }
   
    }


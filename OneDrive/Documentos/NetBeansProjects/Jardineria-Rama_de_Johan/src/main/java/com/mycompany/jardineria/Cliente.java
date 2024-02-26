/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author diego
 */
public class Cliente extends Tabla {
    
    private int codigocliente;
    private String nombrecliente;
    private String nombrecontacto;
    private String apellidocliente;
    private String telefono;
    private String fax;
    private String lineadireccion1;
    private String lineadireccion2;
    private String ciudad;
    private String pais;
    private String codigopostal;
    private String codigoempleadorepventas;
    private String limitecredito;

    
    public Cliente() {
        this.campos ="codigo_cliente,"
                + "nombre_cliente,"
                + "nombre_contacto,"
                + "apellido_contacto,"
                + "telefono,"
            + "fax,linea_direccion1" +
           ",linea_direccion2" +
           ",ciudad" +
           ",pais" +
           ",codigo_postal" +
           ",codigo_empleado_rep_ventas" +
           ",limite_credito";
         this.camposSeparados = this.campos.split(",");
    }
    
    public Cliente(int codigocliente, String nombre_cliente) {
        this.codigocliente = codigocliente;
        this.nombrecliente = nombre_cliente;
    }

    public int getCodigo_cliente() {
        return codigocliente;
    }

    public void setCodigo_cliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getNombre_cliente() {
        return nombrecliente;
    }

    public void setNombre_cliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getNombre_contacto() {
        return nombrecontacto;
    }

    public void setNombre_contacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getApellido_cliente() {
        return apellidocliente;
    }

    public void setApellido_cliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLinea_direccion1() {
        return lineadireccion1;
    }

    public void setLinea_direccion1(String lineadireccion1) {
        this.lineadireccion1 = lineadireccion1;
    }

    public String getLinea_direccion2() {
        return lineadireccion2;
    }

    public void setLinea_direccion2(String linea_direccion2) {
        this.lineadireccion2 = linea_direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigo_postal() {
        return codigopostal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigopostal = codigo_postal;
    }

    public String getCodigo_empleado_rep_ventas() {
        return codigoempleadorepventas;
    }

    public void setCodigo_empleado_rep_ventas(String codigo_empleado_rep_ventas) {
        this.codigoempleadorepventas = codigo_empleado_rep_ventas;
    }

    public String getLimite_credito() {
        return limitecredito;
    }
    
    

    public void setLimite_credito(String limite_credito) {
        this.limitecredito = limite_credito;
    }
   
    @Override
    public String toString() {
        return "cliente{" +
                "codigo_cliente" + codigocliente +
                ", nombre_cliente'" + nombrecliente+ "\"" +"}";} 
}

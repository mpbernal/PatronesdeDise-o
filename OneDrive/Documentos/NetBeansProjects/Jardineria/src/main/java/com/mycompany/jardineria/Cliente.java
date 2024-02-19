/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author diego
 */
public class Cliente {
    
    private int codigo_cliente;
    private String nombre_cliente;
    private String nombre_contacto;
    private String apellido_cliente;
    private String telefono;
    private String fax;
    private String linea_direccion1;
    private String linea_direccion2;
    private String ciudad;
    private String pais;
    private String codigo_postal;
    private String codigo_empleado_rep_ventas;
    private String limite_credito;

    public Cliente() {
    }

    public Cliente(int codigo_cliente, String nombre_cliente) {
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
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
        return linea_direccion1;
    }

    public void setLinea_direccion1(String linea_direccion1) {
        this.linea_direccion1 = linea_direccion1;
    }

    public String getLinea_direccion2() {
        return linea_direccion2;
    }

    public void setLinea_direccion2(String linea_direccion2) {
        this.linea_direccion2 = linea_direccion2;
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
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCodigo_empleado_rep_ventas() {
        return codigo_empleado_rep_ventas;
    }

    public void setCodigo_empleado_rep_ventas(String codigo_empleado_rep_ventas) {
        this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
    }

    public String getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(String limite_credito) {
        this.limite_credito = limite_credito;
    }
    
    @Override
    public String toString() {
        return "cliente{" +
                "codigo_cliente" + codigo_cliente +
                ", nombre_cliente'" + nombre_cliente+ "\"" +"}";} 
}

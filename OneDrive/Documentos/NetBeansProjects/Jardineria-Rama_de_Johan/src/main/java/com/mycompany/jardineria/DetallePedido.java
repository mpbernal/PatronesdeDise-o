    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author johan
 */
public class DetallePedido  {
    private int codigo_pedido;
    private String codigo_producto;
    private int cantidad;
    private float precio_unidad;
    private short numero_linea;

    public DetallePedido(int codigo_pedido, String codigo_producto, int cantidad) {
        this.codigo_pedido = codigo_pedido;
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
    }

    public DetallePedido() {
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(float precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public short getNumero_linea() {
        return numero_linea;
    }

    public void setNumero_linea(short numero_linea) {
        this.numero_linea = numero_linea;
    }
    
    
    
}

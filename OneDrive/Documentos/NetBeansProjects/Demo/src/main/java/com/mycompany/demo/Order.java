/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author wsant
 */


public class Order {
    private int totalCost = 0; // Variable para almacenar el costo total de la orden
    private boolean isClosed = false; // Variable para rastrear si la orden está cerrada o no

    /**
     * Método para procesar la orden.
     * Toma una estrategia de pago como parámetro y delega la recolección de detalles de pago a esa estrategia.
     */
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails(); // Se llama al método para recopilar detalles de pago de la estrategia
        // Aquí podríamos recopilar y almacenar datos de pago de la estrategia.
    }

    /**
     * Método para establecer el costo total de la orden.
     * Suma el costo pasado como argumento al costo total actual.
     */
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    /**
     * Método para obtener el costo total de la orden.
     * Devuelve el costo total de la orden.
     */
    public int getTotalCost() {
        return totalCost;
    }

    /**
     * Método para verificar si la orden está cerrada.
     * Devuelve true si la orden está cerrada, false de lo contrario.
     */
    public boolean isClosed() {
        return isClosed;
    }

    /**
     * Método para marcar la orden como cerrada.
     * Establece la variable isClosed como true.
     */
    public void setClosed() {
        isClosed = true;
    }
}

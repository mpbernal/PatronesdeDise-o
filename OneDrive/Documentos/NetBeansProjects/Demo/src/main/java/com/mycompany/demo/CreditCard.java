/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author wsant
 */
public class CreditCard {
    private int amount;  // Representa la cantidad de dinero asociada con la tarjeta de crédito
    private String number;  // Representa el número de la tarjeta de crédito
    private String date;  // Representa la fecha de expiración de la tarjeta de crédito
    private String cvv;  // Representa el CVV (Valor de Verificación de la Tarjeta) de la tarjeta de crédito

    // Constructor para inicializar la tarjeta de crédito con el número, la fecha y el CVV dados
    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;  // Inicializa amount con un valor predeterminado de 100,000
        this.number = number;  // Inicializa el número de tarjeta de crédito
        this.date = date;  // Inicializa la fecha de expiración
        this.cvv = cvv;  // Inicializa el CVV
    }

    // Método para establecer la cantidad asociada con la tarjeta de crédito
    public void setAmount(int amount) {
        this.amount = amount;  // Actualiza la cantidad
    }

    // Método para obtener la cantidad actual asociada con la tarjeta de crédito
    public int getAmount() {
        return amount;  // Devuelve la cantidad actual
    }
}

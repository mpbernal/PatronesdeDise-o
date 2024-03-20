/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author wsant
 */
/**
 * Interfaz común para todas las estrategias de pago.
 */


public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
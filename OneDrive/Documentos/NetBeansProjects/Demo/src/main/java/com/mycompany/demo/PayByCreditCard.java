/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author wsant
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Estrategia concreta. Implementa el método de pago con tarjeta de crédito.
 */
public class PayByCreditCard implements PayStrategy {
    // BufferedReader para leer la entrada del usuario
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    
    // Tarjeta de crédito utilizada para el pago
    private CreditCard card;

    /**
     * Recolecta los datos de la tarjeta de crédito.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Ingrese el número de la tarjeta: ");
            String number = READER.readLine();
            System.out.print("Ingrese la fecha de expiración de la tarjeta 'mm/aa': ");
            String date = READER.readLine();
            System.out.print("Ingrese el código CVV: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validar el número de tarjeta de crédito...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Después de la validación de la tarjeta, podemos cobrar la tarjeta de crédito del cliente.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Cobrando " + paymentAmount + " usando Tarjeta de Crédito.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    // Método privado para verificar si se ha proporcionado una tarjeta de crédito
    private boolean cardIsPresent() {
        return card != null;
    }
}

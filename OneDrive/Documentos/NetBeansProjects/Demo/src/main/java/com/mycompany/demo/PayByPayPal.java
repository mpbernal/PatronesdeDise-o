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
import java.util.HashMap;
import java.util.Map;

/**
 * Estrategia concreta. Implementa el método de pago PayPal.
 */
public class PayByPayPal implements PayStrategy {
    // Base de datos simulada para verificar los datos del cliente
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    
    // BufferedReader para leer la entrada del usuario
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    
    // Variables para almacenar el correo electrónico y la contraseña del usuario
    private String email;
    private String password;
    
    // Variable para indicar si el usuario ha iniciado sesión correctamente
    private boolean signedIn;

    // Inicialización de la base de datos con algunos datos de ejemplo
    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    /**
     * Recolecta los detalles del pago del cliente.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Ingrese el correo electrónico del usuario: ");
                email = READER.readLine();
                System.out.print("Ingrese la contraseña: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("La verificación de datos ha sido exitosa.");
                } else {
                    System.out.println("¡Correo electrónico o contraseña incorrectos!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Método privado para verificar los datos del usuario
    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * Realiza el pago si el usuario ha iniciado sesión correctamente.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Pagando " + paymentAmount + " usando PayPal.");
            return true;
        } else {
            return false;
        }
    }

    // Método privado para establecer si el usuario ha iniciado sesión correctamente
    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}

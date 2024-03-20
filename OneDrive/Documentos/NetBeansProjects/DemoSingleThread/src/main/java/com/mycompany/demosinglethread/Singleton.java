/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demosinglethread;

/**
 *
 * @author wsant
 */
public final class Singleton {
    private static Singleton instance; // Variable estática que almacena la única instancia de la clase Singleton
    public String value; // Variable que almacena el valor asociado a la instancia Singleton

    private Singleton(String value) { // Constructor privado para evitar instanciación externa
        // El siguiente código emula una inicialización lenta
        try {
            Thread.sleep(1000); // Pausa de 1000 milisegundos (1 segundo)
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value; // Asigna el valor proporcionado al constructor a la variable de instancia value
    }

    public static Singleton getInstance(String value) { // Método estático para obtener la instancia Singleton
        if (instance == null) { // Si no hay instancia existente
            instance = new Singleton(value); // Crea una nueva instancia Singleton con el valor proporcionado
        }
        return instance; // Devuelve la instancia existente o recién creada
    }
}
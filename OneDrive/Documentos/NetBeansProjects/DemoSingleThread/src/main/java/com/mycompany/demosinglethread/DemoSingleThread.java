/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demosinglethread;

/**
 *
 * @author wsant
 */
public class DemoSingleThread {
    public static void main(String[] args) {
        // Imprimir mensaje de instrucciones
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Obtener la instancia del Singleton
        Singleton singleton = Singleton.getInstance("FOO");
        // Obtener otra instancia del Singleton
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        // Imprimir los valores de las instancias
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

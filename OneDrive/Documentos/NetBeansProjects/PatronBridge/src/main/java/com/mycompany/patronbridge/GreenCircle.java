/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbridge;

/**
 *
 * @author diego
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Dibujando círculo verde de radio " + radius + " en las coordenadas (" + x + ", " + y + ")");
    }
}

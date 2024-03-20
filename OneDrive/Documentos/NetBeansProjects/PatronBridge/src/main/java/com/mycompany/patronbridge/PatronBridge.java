/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronbridge;

/**
 *
 * @author diego
 */
public class PatronBridge {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 200, 20, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

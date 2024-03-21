/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.memento;

/**
 *
 * @author wsant
 */


import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        // Crear una instancia de Editor
        Editor editor = new Editor();

        // Cargar formas en el editor
        editor.loadShapes(
                // Círculo azul en la posición (10, 10) con radio 10
                new Circle(10, 10, 10, Color.BLUE),

                // Forma compuesta con un círculo rojo y un punto rojo
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED), // Círculo rojo en la posición (110, 110) con radio 50
                        new Dot(160, 160, Color.RED) // Punto rojo en la posición (160, 160)
                ),

                // Forma compuesta con un rectángulo verde y varios puntos verdes
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN), // Rectángulo verde en la posición (250, 250) con ancho 100 y altura 100
                        new Dot(240, 240, Color.GREEN), // Punto verde en la posición (240, 240)
                        new Dot(240, 360, Color.GREEN), // Punto verde en la posición (240, 360)
                        new Dot(360, 360, Color.GREEN), // Punto verde en la posición (360, 360)
                        new Dot(360, 240, Color.GREEN) // Punto verde en la posición (360, 240)
                )
        );
    }
}

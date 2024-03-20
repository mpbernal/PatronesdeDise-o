/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronprototype;

/**
 *
 * @author diego
 */
public class PatronPrototype {

   public static void main(String[] args) {
        Rectangle originalRectangle = new Rectangle(100, 50);
        System.out.println("Original Rectangle: " + originalRectangle);

        // Clonar el rectángulo original
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        System.out.println("Cloned Rectangle: " + clonedRectangle);

        // Cambiar las dimensiones del rectángulo clonado
        clonedRectangle.setWidth(200);
        clonedRectangle.setHeight(100);
        System.out.println("Modified Cloned Rectangle: " + clonedRectangle);
    }
}

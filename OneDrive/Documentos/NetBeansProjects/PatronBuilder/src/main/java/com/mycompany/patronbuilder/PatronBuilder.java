/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronbuilder;

/**
 *
 * @author diego
 */
public class PatronBuilder {

  public static void main(String[] args) {
        // Creamos un builder para una pizza Margherita
        PizzaBuilder builder = new MargheritaPizzaBuilder();

        // Creamos un camarero y le asignamos el builder
        Waiter waiter = new Waiter(builder);

        // Construimos la pizza
        Pizza pizza = waiter.getPizza();

        // Imprimimos la pizza
        System.out.println("Pizza Margherita: " + pizza);
    }
}

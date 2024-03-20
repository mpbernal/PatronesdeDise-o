/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder;

/**
 *
 * @author diego
 */
public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.pizza = new Pizza("Regular", "Tomato", "Mozzarella");
    }

    @Override
    public PizzaBuilder addDough(String dough) {
        pizza = new Pizza(dough, pizza.sauce, pizza.topping);
        return this;
    }

    @Override
    public PizzaBuilder addSauce(String sauce) {
        pizza = new Pizza(pizza.dough, sauce, pizza.topping);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        pizza = new Pizza(pizza.dough, pizza.sauce, topping);
        return this;
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfacade;

/**
 *
 * @author diego
 */
public class Facade {
    
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    // Método que proporciona una interfaz unificada para realizar una serie de operaciones
    public void doComplexOperation() {
        System.out.println("Iniciando operación compleja...");
        subsystem1.operation1();
        subsystem2.operation2();
        subsystem3.operation3();
        System.out.println("Operación compleja finalizada.");
    }
}

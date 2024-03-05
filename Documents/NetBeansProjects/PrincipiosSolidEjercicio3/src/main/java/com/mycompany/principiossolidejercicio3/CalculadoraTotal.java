/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolidejercicio3;


/**
 *
 * @author diego
 */
public class CalculadoraTotal {
    public float calcularTotal(float importeFactura, int porcentajeDeduccion) {
        CalculadoraDeduccion calculadoraDeduccion = new CalculadoraDeduccion();
        CalculadoraIVA calculadoraIVA = new CalculadoraIVA();

        float importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        float importeIVA = calculadoraIVA.calcularIVA(importeFactura);

        return (importeFactura - importeDeduccion) + importeIVA;
    }
}

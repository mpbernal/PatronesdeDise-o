/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiossolidejercicio3;

/**
 *
 * @author diego
 */
public class CalculadoraIVA {
    public float calcularIVA(float importeFactura,String codigoFactura) {
           if("0".equals(codigoFactura)){
               return 0;
    }else
        return (float) (importeFactura * 0.18);
    }

    float calcularIVA(float importeFactura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

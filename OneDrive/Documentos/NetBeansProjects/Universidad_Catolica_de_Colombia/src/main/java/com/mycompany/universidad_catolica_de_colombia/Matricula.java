/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad_catolica_de_colombia;

/**
 *
 * @author diego
 */
public class Matricula {
    
    private double precioMatricula;
    private String referenciaMatricula;
    private short semestreDeMetricula;

    public Matricula(double precioMatricula, String referenciaMatricula, short semestreDeMetricula) {
        this.precioMatricula = precioMatricula;
        this.referenciaMatricula = referenciaMatricula;
        this.semestreDeMetricula = semestreDeMetricula;
    }

    public double getPrecioMatricula() {
        return precioMatricula;
    }

    public String getReferenciaMatricula() {
        return referenciaMatricula;
    }

    public short getSemestreDeMetricula() {
        return semestreDeMetricula;
    }

    public void setPrecioMatricula(double precioMatricula) {
        this.precioMatricula = precioMatricula;
    }

    public void setReferenciaMatricula(String referenciaMatricula) {
        this.referenciaMatricula = referenciaMatricula;
    }

    public void setSemestreDeMetricula(short semestreDeMetricula) {
        this.semestreDeMetricula = semestreDeMetricula;
    }
    
    
    
}

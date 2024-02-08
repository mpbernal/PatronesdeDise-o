/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matricula_catolica;

/**
 *
 * @author diego
 */
public class Estudiante {
    
    String Nombre;
    String Apellido;
    private int NumeroDeIdentificación;
    String Carrera;
    String Materia;
    String Jornada;
    int Grupo;
    
     public int getNumeroDeIdentificación() {
        return NumeroDeIdentificación;
    }

    public void setNumeroDeIdentificación(int NumeroDeIdentificación) {
        this.NumeroDeIdentificación = NumeroDeIdentificación;
    }
}

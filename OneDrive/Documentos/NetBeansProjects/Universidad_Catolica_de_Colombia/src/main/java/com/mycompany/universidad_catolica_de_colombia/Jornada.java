/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad_catolica_de_colombia;

/**
 *
 * @author diego
 */
public class Jornada {
    
    private String Tipo_joranda;
    private int Grupo_Jornada;

    public Jornada(String Tipo_joranda, int Grupo_Jornada) {
        this.Tipo_joranda = Tipo_joranda;
        this.Grupo_Jornada = Grupo_Jornada;
    }

    public String getTipo_joranda() {
        return Tipo_joranda;
    }

    public int getGrupo_Jornada() {
        return Grupo_Jornada;
    }

    public void setTipo_joranda(String Tipo_joranda) {
        this.Tipo_joranda = Tipo_joranda;
    }

    public void setGrupo_Jornada(int Grupo_Jornada) {
        this.Grupo_Jornada = Grupo_Jornada;
    }
    
    
    
}

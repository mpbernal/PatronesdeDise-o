/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author johan
 */
public abstract class Tabla {
    String[] camposSeparados;
    String campos;

    public String[] getCamposSeparados() {
        return camposSeparados;
    }

    public void setCamposSeparados(String[] camposSeparados) {
        this.camposSeparados = camposSeparados;
    }

    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }
    
}

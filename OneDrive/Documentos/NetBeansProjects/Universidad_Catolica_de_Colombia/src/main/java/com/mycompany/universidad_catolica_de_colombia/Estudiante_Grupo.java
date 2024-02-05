/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad_catolica_de_colombia;

/**
 *
 * @author sala4
 */
public class Estudiante_Grupo {
    private int  Id_Estudiante;
    private String Codigo_Materia;
    
     public Estudiante_Grupo (int Id_Estudiante,String Codigo_Materia){
         
         this.Id_Estudiante=Id_Estudiante;
         this.Codigo_Materia=Codigo_Materia;
     }

    /**
     * @return the Id_Estudiante
     */
    public int getId_Estudiante() {
        return Id_Estudiante;
    }

    /**
     * @param Id_Estudiante the Id_Estudiante to set
     */
    public void setId_Estudiante(int Id_Estudiante) {
        this.Id_Estudiante = Id_Estudiante;
    }

    /**
     * @return the Codigo_Materia
     */
    public String getCodigo_Materia() {
        return Codigo_Materia;
    }

    /**
     * @param Codigo_Materia the Codigo_Materia to set
     */
    public void setCodigo_Materia(String Codigo_Materia) {
        this.Codigo_Materia = Codigo_Materia;
    }

    
}

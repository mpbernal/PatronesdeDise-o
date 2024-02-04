/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad_catolica_de_colombia;

/**
 *
 * @author diego
 */
public class Grupo {
    private int Id_Estudiante;
     private String Materia;
     private String Codigo_Materia;
     
     public Grupo (int Id_Estudiante,String Materia,String Codigo_Materia){
         
         this.Id_Estudiante=Id_Estudiante;
         this.Materia=Materia;
         this.Codigo_Materia=Codigo_Materia;
     }

    public int getId_Estudiante() {
        return Id_Estudiante;
    }

    public String getMateria() {
        return Materia;
    }

    public String getCodigo_Materia() {
        return Codigo_Materia;
    }

    public void setId_Estudiante(int Id_Estudiante) {
        this.Id_Estudiante = Id_Estudiante;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public void setCodigo_Materia(String Codigo_Materia) {
        this.Codigo_Materia = Codigo_Materia;
    }
    
}

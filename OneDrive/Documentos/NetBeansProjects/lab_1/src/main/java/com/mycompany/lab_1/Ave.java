/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1;
import com.mycompany.lab_1.TipoSonido;

/**
 *
 * @author diego
 */
public abstract class Ave {
    
  TipoSonido tipoSonido;
  TipoVuelo tipoVuelo;
  
  public void realizVuelo(){
  
      tipoVuelo.Vuelo();
  }
  
  public void realizaSonido(){
  
      tipoSonido.makeSound();
  }
   
    
}

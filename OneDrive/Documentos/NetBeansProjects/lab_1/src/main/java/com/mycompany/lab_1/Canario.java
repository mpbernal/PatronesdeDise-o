/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author diego
 */
public class Canario extends Ave {
    
    public static final Logger logger = LoggerFactory.getLogger(Canario.class);
    
    public Canario(){
      logger.debug("instanciando un canario");
      tipoSonido = new Canto();
      tipoVuelo = new VueloConAlas();
    }
}

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
public class VueloConAlas implements TipoVuelo {
    
    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
    
    @Override
    public void Vuelo(){
       logger.debug("Esta volando, aleteando");
       System.out.println("Esta volando, aleteando");
    }
    
}

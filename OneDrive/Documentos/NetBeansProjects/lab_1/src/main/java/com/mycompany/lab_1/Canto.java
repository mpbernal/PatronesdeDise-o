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
public class Canto implements TipoSonido {
    
    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    
    @Override
    public void makeSound(){
       logger.debug("estoy cantando");
       System.out.println("estoy cantando");
    }
    
}

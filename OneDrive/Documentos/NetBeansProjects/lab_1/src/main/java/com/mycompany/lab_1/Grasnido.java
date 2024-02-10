/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



/**
 *
 * @author diego
 */
public class Grasnido implements TipoSonido {
    
    public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
    
    
    @Override
    public void makeSound(){
        logger.debug("grasnado");
        System.out.println("grasnado");
    }
    
}

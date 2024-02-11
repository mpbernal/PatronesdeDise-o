/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;

/**
 *
 * @author diego
 */
public class Lab5TestCase {
    
    public static final Logger logger = LoggerFactory.getLogger(Lab5TestCase.class);
    
    public void canarioTestCase(){
         Canario canario = new Canario();
         Assert.assertNotNull(canario);
         
         logger.debug("canario realizaVuelo");
         System.out.println("canario realizaVuelo");
         canario.realizaVuelo();
         logger.debug("canario realizaSonido");
         System.out.println("canario realizaSonido");
         canario.realizaSonido();
         System.out.println("canario cambia sonido ave");
         canario.setTipoSonido(new Grasnido());
         System.out.println("canario realizaSonido");
         canario.realizaSonido();
    }
    
    
}

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
public class AvesTruz extends Ave {
    
    public static final Logger logger = LoggerFactory.getLogger(AvesTruz.class);
    
    public AvesTruz (){
       logger.debug("instanciando aveztruz");
       tipoSonido = new SinCanto();
       tipoVuelo = new SinVuelo();
       
    }
    
}

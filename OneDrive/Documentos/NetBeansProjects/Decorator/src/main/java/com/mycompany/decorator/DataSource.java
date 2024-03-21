/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author wsant
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}

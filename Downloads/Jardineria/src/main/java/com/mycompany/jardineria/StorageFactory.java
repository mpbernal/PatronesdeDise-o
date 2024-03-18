/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.jardineria;

import java.sql.SQLException;

/**
 *
 * @author johan
 * @param <K>
 */
public interface StorageFactory<K> {
    void save(String tableName, String[] columns, K[] values) throws SQLException;
}

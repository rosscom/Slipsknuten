/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.enterprise.inject.Produces;

/**
 *
 * @author ulfrossang
 */
public class Initial {
    
    @Produces
    private String dbInstance;        
    
    public Initial() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                        .getResourceAsStream("slips.properties");
            if (inputStream != null) {
                properties.load(inputStream);
                dbInstance = properties.getProperty("dbInstance");
            }
        } catch (IOException ex) {
            // log exception 
            dbInstance = "default"; 
        }
    }    
}

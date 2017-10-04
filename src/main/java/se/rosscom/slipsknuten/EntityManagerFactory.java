/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Produces;

/**
 *
 * @author ulfrossang
 */
@Stateless
public class EntityManagerFactory {
    
    @Inject
    private String dbInstace;
    
    @PersistenceContext(unitName = "prod")
    private EntityManager emProd;

    @Produces
    public EntityManager getEntityManager() {
        System.out.println("dbInstance: " + dbInstace);
        if (null != dbInstace) switch (dbInstace) {
            case "prod":
                return emProd;
            default:
                break;
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.boundary;

import java.util.List;
import javax.inject.Inject;
import se.rosscom.slipsknuten.EntityManagerFactory;
import se.rosscom.slipsknuten.entity.Activity;

/**
 *
 * @author ulfrossang
 */
public class ActivityService {
    
    @Inject
    EntityManagerFactory emFactory;
    
    public void persist(Activity e) {
        emFactory.getEntityManager().persist(e);
    }

    public List<Activity> get() {
        return emFactory.getEntityManager().createNamedQuery("Activity.findAll", Activity.class).getResultList();
    }   
}

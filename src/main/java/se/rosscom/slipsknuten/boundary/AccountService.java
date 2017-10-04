/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import se.rosscom.slipsknuten.EntityManagerFactory;
import se.rosscom.slipsknuten.entity.Account;

/**
 *
 * @author ulfrossang
 */
@Stateless
public class AccountService {
    
    @Inject
    EntityManagerFactory emFactory;

    public void persist(Account e) {
        emFactory.getEntityManager().persist(e);
    }

    public List<Account> get() {
        return emFactory.getEntityManager().createNamedQuery("Account.findAll", Account.class).getResultList();
    }
    
}

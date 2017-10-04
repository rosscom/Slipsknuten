/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import se.rosscom.slipsknuten.entity.Account;

/**
 *
 * @author ulfrossang
 */
@Stateless
@Path("account")
public class AccountResource {
    
    @Inject
    AccountService accountService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> get(){
        return accountService.get();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.rosscom.slipsknuten.boundary;

import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author ulfrossang
 */
@Path("activity")
public class ActivityResource {
    
    @Inject
    ActivityService activityService;
    
}

package se.rosscom.slipsknuten.ping;

import javax.json.Json;
import javax.json.JsonObject;
import java.time.LocalDateTime;
import javax.ejb.Stateless;
import javax.inject.Inject;
import se.rosscom.slipsknuten.EntityManagerFactory;

@Stateless
public class PingService {
    
    
    @Inject
    EntityManagerFactory emFactory;

    
    @Inject 
    String dbInstance;

    public JsonObject ping() {
        return Json.createObjectBuilder()
                .add("environment", getEnv())  //TODO should add logic to find out which environment is running
                .add("systemTime", LocalDateTime.now().toString())
                .add("databaseConnection", checkDb())
                .build();
    }

    private boolean checkDb() {
        return emFactory.getEntityManager().isOpen();

    }
    
    private String getEnv() {
        return dbInstance;
    }
}

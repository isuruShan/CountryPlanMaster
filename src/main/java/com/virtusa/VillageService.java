package com.virtusa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("village")
public class VillageService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Village getVillage(){
        VillageDAO villageDAO = new VillageDAO();
        Village village = villageDAO.getData(6);
        System.out.println(village);
        return village;
    }

}

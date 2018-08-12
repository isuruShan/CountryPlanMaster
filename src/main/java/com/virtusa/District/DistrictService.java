package com.virtusa.District;

import org.apache.ibatis.annotations.Delete;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Path("/district")
public class DistrictService {
    DistrictResource districtResources = new DistrictResource();
    DistrictDAO districtDAO = new DistrictDAOImpl();

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<District> getDistricts(){
//        List<District> districts = districtResources.getAllDistricts();
//        return districts;
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<District> getDistricts() {
        List<District> districts = districtDAO.getAllDistricts();
        return districts;
    }
//    @GET
//    @Path("/{name}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public District getDistrict(@PathParam("name") String name) {
//        List<District> districts = districtResources.getAllDistricts();
//        District dist = new District();
//        for (District dis:districts){
//           if(dis.getName().equalsIgnoreCase(name)){
//               dist = dis;
//               return dist;
//           }
//        }
//        return null;
//    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public District getDistrict(@PathParam("name") String name) {
        District district = districtDAO.getDistrictByName(name);
        return district;
    }

//    @DELETE
//    @Path("/{id}")
//    public void getDistrict(@PathParam("id") int id) {
//        districtResources.deleteDistrict(id);
//    }
    @DELETE
    @Path("/{id}")
    public void getDistrict(@PathParam("id") int id) {
        districtDAO.deleteDistrict(id);
    }

//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void addDistrict(District district) {
//        districtResources.addDistrict(district);
//    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addDistrict(District district) {
        districtDAO.addDistrict(district);
    }

//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void editDistrict(District district) {
//        districtResources.editDistrict(district);
//    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editDistrict(District district) {
        districtDAO.editDistrict(district);
    }


}

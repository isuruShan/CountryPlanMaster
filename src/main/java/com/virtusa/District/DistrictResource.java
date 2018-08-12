package com.virtusa.District;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistrictResource {
    private static HashMap<Integer,District> districtMap = new HashMap<Integer,District>();
    private static int maxId = 4;
    DistrictResource() {
        if (districtMap.size()==0) {
            District district1 = new District(1, "Colombo", "Nihal Jayamanna");
            District district2 = new District(2, "Gampaha", "Saman Rathnapriya");
            District district3 = new District(3, "Kaluthra", "Piyasiri Withanage");
            District district4 = new District(4, "Rathnapura", "Kasu Palihawadana");
            districtMap.put(1,district1);
            districtMap.put(2,district2);
            districtMap.put(3,district3);
            districtMap.put(4,district4);
        }
    }
    public  List<District> getAllDistricts()
    {
        List<District> districts = new ArrayList<>(districtMap.values());
        return districts;
    }

    public void deleteDistrict(int id){
        districtMap.remove(id);
    }
    public void addDistrict(District district){
        district.setId(maxId+1);
        districtMap.put(maxId+1,district);
        maxId+=1;
    }

    public void editDistrict(District district){
        districtMap.remove(district.getId());
        districtMap.put(district.getId(),district);
    }


}

package com.virtusa.District;

import java.util.List;

public interface DistrictDAO {
    public List<District> getAllDistricts();
    public District getDistrictByName(String name);
    public void addDistrict(District district);
    public void deleteDistrict(int id);
    public void editDistrict(District district);

}

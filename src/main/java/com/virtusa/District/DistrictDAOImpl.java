package com.virtusa.District;

import com.virtusa.MyBatisUtil;
import com.virtusa.Village;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistrictDAOImpl implements DistrictDAO {
    DistrictDAOImpl() {
        super();
    }

    @Override
    public List<District> getAllDistricts() {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<District> district = new ArrayList<>();
        try{
            district = session.selectList("com.virtusa.District.DistrictMapper.selectAllDistricts");
        }
        catch (Exception e){
            System.err.print(e);
        }
        finally {
            session.close();
        }
        return district;
    }

    @Override
    public District getDistrictByName(String name) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        District district = new District();
        try{
            district = session.selectOne("com.virtusa.District.DistrictMapper.selectDistrict", name);
        }
        catch (Exception e){
            System.err.print(e);
        }
        finally {
            session.close();
        }
        return district;
    }

    @Override
    public void addDistrict(District district) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            session.insert("com.virtusa.District.DistrictMapper.insertDistrict", district);
            session.commit();
        }
        catch (Exception e){
            System.err.print(e);
        }
        finally {
            session.close();
        }
    }

    @Override
    public void deleteDistrict(int id) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            session.delete("com.virtusa.District.DistrictMapper.deleteDistrict", id);
            session.commit();
        }
        catch (Exception e){
            System.err.print(e);
        }
        finally {
            session.close();
        }

    }

    @Override
    public void editDistrict(District district) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            session.update("com.virtusa.District.DistrictMapper.updateDistrict", district);
            session.commit();
        }
        catch (Exception e){
            System.err.print(e);
        }
        finally {
            session.close();
        }

    }
}

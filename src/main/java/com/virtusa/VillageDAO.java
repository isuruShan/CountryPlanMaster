package com.virtusa;

import org.apache.ibatis.session.SqlSession;

public class VillageDAO {
    public void save(Village village){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.insert("com.virtusa.VillageMapper.insertVillage", village);
        session.commit();
        session.close();
    }
    public void update(Village village){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.update("com.virtusa.VillageMapper.updateVillage", village);
        session.commit();
        session.close();
    }
    public void delete(Integer id){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.delete("com.virtusa.VillageMapper.deleteVillage", id);
        session.commit();
        session.close();
    }
    public Village getData(Integer id) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Village village = session.selectOne("com.virtusa.VillageMapper.selectVillage", id);
        System.out.println(id);
        session.close();
        return village;
    }
}

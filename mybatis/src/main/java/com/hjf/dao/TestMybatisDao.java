//package com.hjf.dao;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * ClassName:TestMybatisDao
// * Author:Hejunfeng
// * Date:2019/7/18 15:28
// */
//public class TestMybatisDao {
//    private SqlSessionFactory sqlSessionFactory;
//
//    @Before
//    public void init()throws IOException{
//        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
//    }
//    @Test
//    public void testDao(){
//        UserDaoImpl userDao=new UserDaoImpl();
//        userDao.setSqlSessionFactory(sqlSessionFactory);
//        System.out.println(userDao.findUserById(10));
//    }
//
//}
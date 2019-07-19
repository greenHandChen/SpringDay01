package com.hand.srudy;

import com.hand.srudy.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;



public class MybatisDaoTest {


    @Test
    public void testDao() throws Exception
    {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(factory);
        System.out.println(userDao.findUserById(1L));
        System.out.println(userDao.findUserByUsername("张"));


    }
}
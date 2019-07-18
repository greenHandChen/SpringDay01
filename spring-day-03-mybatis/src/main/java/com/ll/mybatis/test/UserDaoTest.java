package com.ll.mybatis.test;

import com.ll.mybatis.dao.UserDao;
import com.ll.mybatis.dao.impl.UserDaoImpl;
import com.ll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoTest {

    private  SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindById() throws IOException {

        //创建UserDao对象
        UserDao dao = new UserDaoImpl(sqlSessionFactory);

        User user = dao.findUserById(1);

        System.out.println(user);

    }

    @Test
    public void testFindUserByName() throws IOException {

        UserDao dao = new UserDaoImpl(sqlSessionFactory);

        List<User> users = dao.findUserByName("小明");

        users.forEach(System.out::println);


    }

    @Test
    public void testInsertUser(){

        User user = new User();
        user.setAddress("BeiJing");
        user.setSex("1");
        user.setUsername("Wang ling");

        UserDao dao = new UserDaoImpl(sqlSessionFactory);
        dao.insertUser(user);

    }
}

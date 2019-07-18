package com.lzn.mybatis.dao.imp;

import com.lzn.mybatis.dao.IUserDao;
import com.lzn.mybatis.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImpTest {

    private UserDaoImp userDao;
    @Before
    public void setUp() throws Exception {
        userDao = new UserDaoImp();
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));
        userDao.setSqlSessionFactory(sqlSessionFactory);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findUserById() {
        UserEntity user = userDao.findUserById(new Integer(1));
        System.out.println(user);
        System.out.println("findUserById() end");
    }

    @Test
    public void findUserByUsername() {
        List<UserEntity> users = userDao.findUserByUsername("hehe");
        System.out.println(users);
        System.out.println("findUserByUsername() end");
    }

    @Test
    public void addUser() {
        UserEntity user = new UserEntity();
        user.setSex(1);
        user.setBirthday(new Date());
        user.setAddress("test of addUser");
        user.setUsername("hehe");
        userDao.addUser(user);
        System.out.println("addUser() end");
    }
}
package com.itheima.mybatis.dao;

import com.itheima.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        String resources ="SqlMapConfig.xml";
        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resources);
        //创建sqlsessionfactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
    @Test
    public void finUserById() throws Exception {
        //创建userDao
        UserDao dao = new UserDaoImpl(sqlSessionFactory);
        User user = dao.finUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUserByName() {
    }

    @Test
    public void insertUser() {
    }
}
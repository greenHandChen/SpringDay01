package com.hand.mybatis.dao;

import com.hand.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 16:03
 * @Version 1.0
 */

public class UserDaoTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void SetUp() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {

        //创建UserDao
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);

        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserByName() throws Exception {

        //创建UserDao
        UserDao userDao2 = new UserDaoImpl(sqlSessionFactory);

        List<User> list = userDao2.findUserByName("熊依琳");
        System.out.println(list);
    }

    @Test
    public void testinsertUser() throws Exception {

        //创建UserDao
        UserDao userDao3 = new UserDaoImpl(sqlSessionFactory);

        User user = new User();
        user.setUsername("熊依琳222");
        user.setAddress("深圳222");

        userDao3.insertUser(user);
    }
}

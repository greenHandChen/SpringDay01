package com.itheima.ms.dao;

import com.itheima.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    private ApplicationContext context;
    @Before
    public void setUp() throws Exception{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception{
        UserDao userDao = context.getBean("userDao", UserDao.class);
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}

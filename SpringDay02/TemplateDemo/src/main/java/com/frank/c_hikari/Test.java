package com.frank.c_hikari;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext applicationContext;
    UserDao userDao;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext_hikari.xml");
        userDao = applicationContext.getBean(UserDao.class);
    }
    @org.junit.Test
    public void test(){
        User user = new User();
        user.setId(2);
        user.setUsername("李四");
        user.setPassword("352k3");
        userDao.updateUser(user);
    }
    @org.junit.Test
    public void test2(){
        User user = new User();
        user.setUsername("李四");
        user.setPassword("352k3");
        userDao.insertUser(user);
    }
}

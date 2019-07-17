package com.sise.spring.b_api;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHikari {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = context.getBean("userDao",UserDao.class);
    User user = new User();

    @Test
    public void testUserDao(){
        user.setId(2);
        user.setUsername("sky");
        user.setPassword("123");
        userDao.update(user);
    }

    @Test
    public void testDruid(){

        user.setId(2);
        userDao.delete(user);
    }
}

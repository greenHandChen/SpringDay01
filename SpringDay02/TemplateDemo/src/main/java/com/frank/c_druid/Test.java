package com.frank.c_druid;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext applicationContext;
    UserDao userDao;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext_druid.xml");
        userDao = applicationContext.getBean(UserDao.class);
    }

    @org.junit.Test
    public void test(){
        User user = new User();
        user.setId(6);
        userDao.deleteUser(user);
    }

}

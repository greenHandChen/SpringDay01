package com.hand.test;

import com.hand.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

    @Test
    public void demo01(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        System.out.println(userDao.findUserById(1));
    }
}

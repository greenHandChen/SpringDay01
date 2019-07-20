package com.frank.test;

import com.frank.dao.UserDao;
import com.frank.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    private UserDao userDao;
    @Before
    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao = (UserDao) applicationContext.getBean("userDao");
    }
    @Test
    public void test(){
        User user = userDao.findUserById(25);
        System.out.println(user);
    }
}

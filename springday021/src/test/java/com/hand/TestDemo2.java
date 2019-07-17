package com.hand;

import com.hand.demo2.UserDao;
import com.hand.po.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDemo2 {
    @Test
    public void testApiSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo2.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(4);
        user.setUsername("yyy");
        user.setPassword("12345");
        userDao.update(user);
    }
}

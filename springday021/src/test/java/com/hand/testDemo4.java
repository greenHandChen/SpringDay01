package com.hand;

import com.hand.demo4.JDSUserDao;
import com.hand.po.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

public class testDemo4 {
    @Test
    public void testJDSUserDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo4.xml");
        JDSUserDao jDSUserDao = applicationContext.getBean("jDSUserDao",JDSUserDao.class);
        User user = new User();
        user.setId(4);
        user.setUsername("yyy");
        user.setPassword("12345");
        jDSUserDao.update(user);

    }
    @Test
    public void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo4.xml");
        JDSUserDao jDSUserDao = applicationContext.getBean("jDSUserDao",JDSUserDao.class);
        System.out.println(jDSUserDao.getUser());
    }
}

package com.java.web.spring.c_springxml;

import com.java.web.spring.a_entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHikari {

    @Test
    public void testUserUpdate(){

        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\c_springxml\\application-context1.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(2L);
        user.setUsername("alice");
        user.setPassword("linus");
        userDao.update(user);

    }
}

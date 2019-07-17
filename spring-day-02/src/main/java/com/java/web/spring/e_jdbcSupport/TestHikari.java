package com.java.web.spring.e_jdbcSupport;

import com.java.web.spring.a_entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHikari {

    @Test
    public void testUserUpdate(){

        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\e_jdbcSupport\\application-context.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(3L);
        user.setUsername("alice");
        user.setPassword("helloscala");
        userDao.update(user);

    }

    @Test
    public void testUserDelete(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\e_jdbcSupport\\application-context.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        userDao.delete(2l);
    }
}
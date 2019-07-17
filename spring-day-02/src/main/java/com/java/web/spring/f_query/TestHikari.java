package com.java.web.spring.f_query;

import com.java.web.spring.a_entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testUserSimpleQuery(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\f_query\\application-context.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        Integer integer = userDao.querySimple01();
        System.out.println(integer);
    }

    @Test
    public void testFindUserById(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\f_query\\application-context.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        User byId = userDao.findUserById(new User(2L, "123", "11"));
        System.out.println(byId);
    }

    @Test
    public void testQueryAllUsers(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring-day-02\\src\\main\\java\\com\\java\\web\\spring\\f_query\\application-context.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        List<User> list =  userDao.getUsers();
        System.out.println(list);
    }


}

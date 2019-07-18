package com.frank.jdbcSupport;


import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    ApplicationContext applicationContext;
    UserDao userDao;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext_jdbcSupport.xml");
        userDao = applicationContext.getBean(UserDao.class);
    }
    @org.junit.Test
    public void test(){
        User user = new User();
        user.setId(6);
        user.setUsername("李四");
        user.setPassword("352k3");
        userDao.update(user);
    }
    @org.junit.Test
    public void test2(){
        User user = new User();
        user.setId(6);
        userDao.delete(user);
    }

    /**
     * 查询单条信息
     */
    @org.junit.Test
    public void test3(){
        User user = new User();
        user.setId(5);
        User user1 = userDao.getUserById(user);
        System.out.println(user1);
    }
    /**
     * 查询多条信息
     */
    @org.junit.Test
    public void test4(){
        List<User> list = userDao.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }
}

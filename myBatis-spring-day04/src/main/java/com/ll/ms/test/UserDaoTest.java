package com.ll.ms.test;

import com.ll.ms.dao.UserDao;
import com.ll.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    private  ApplicationContext ctx = null;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        UserDao userDao = ctx.getBean("userDao", UserDao.class);
        User userById = userDao.findUserById(10);
        System.out.println(userById);
    }



}

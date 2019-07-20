package com.hand.mybatis.spring.test;

import com.hand.mybatis.spring.dao.UserDao;
import com.hand.mybatis.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 14:15
 **/
public class DemoTest {

    @Test
    public void test1() {
        String source = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(source);
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.findUserById(1));
    }

    @Test
    public void test2() {
        String source = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(source);
        UserServiceImpl userService = applicationContext.getBean(UserServiceImpl.class);
        System.out.println(userService.findUserById(1));
    }

}

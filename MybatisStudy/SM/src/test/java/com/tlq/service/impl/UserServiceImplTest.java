package com.tlq.service.impl;

import com.tlq.enity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        User user = userService.findUserById(10);
        System.out.println(user.getUsername());
    }

}
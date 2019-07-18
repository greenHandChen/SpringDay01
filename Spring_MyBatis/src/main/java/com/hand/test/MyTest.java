package com.hand.test;

import com.hand.service.IUserService;
import com.hand.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    private IUserService userService;
    @Before
    public void setUp(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        userService = applicationContext.getBean(UserServiceImpl.class);
    }

    @Test
   public void test01(){
        System.out.println(userService.getAllUser());
   }

}

package com.hand;

import com.hand.service.UserService;
import com.hand.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    ApplicationContext ac;
    UserService us;

    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        us = ac.getBean("userServiceImpl", UserServiceImpl.class);
    }

    @Test
    public void testJdbcTemplate(){
        us.changePSW("ora02","1234");
    }

}

package com.hsl.spring.demo02;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class test {


    @Test
    public void findUser(){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.find();

    }

}

package com.hand.test;


import com.hand.service.IUserService;
import com.hand.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    ApplicationContext context;
    @Before
    public void setUp(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test01(){
        //获取代理对象时需要的是其接口的类对象
        IUserService userService = context.getBean("serviceProxy", IUserService.class);
        userService.service01();

        System.out.println("=================================================");

        userService.service02();
    }

    /**
     * 测试顾问
     */
    @Test
    public void testAdvisor(){
        IUserService userService = context.getBean("userService",IUserService.class);
        userService.service01();
        userService.service02();
    }


}

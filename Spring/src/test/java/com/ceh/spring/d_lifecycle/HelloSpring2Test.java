package com.ceh.spring.d_lifecycle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.internal.APOptions;

import static org.junit.Assert.*;

public class HelloSpring2Test {

    ApplicationContext applicationContext = null;
    private HelloSpring2 helloSpring2 = null;
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        helloSpring2 = (HelloSpring2) applicationContext.getBean("helloSpring2");


    }

    @Test
    public void test1() {
        helloSpring2.test();
    }

    @After
    public void tearDown() throws  Exception {
        // 释放
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
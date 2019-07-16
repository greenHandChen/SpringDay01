package com.ceh.spring.e_inject.a_constructor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Person2Test {
    ApplicationContext applicationContext = null;
    Person2 p = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans5.xml");
        p = (Person2) applicationContext.getBean("person2");

    }

    @After
    public void tearDown() throws Exception {
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void toString1() {
        System.out.println(p.toString());
    }
}
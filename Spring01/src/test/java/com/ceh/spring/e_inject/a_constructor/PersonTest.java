package com.ceh.spring.e_inject.a_constructor;

import com.ceh.spring.d_lifecycle.HelloSpring2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PersonTest {
    ApplicationContext applicationContext = null;
    Person p = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans4.xml");
         p = (Person) applicationContext.getBean("person");

    }
    @Test
    public void now() {
        System.out.println(p.toString());
    }

    @After
    public void tearDown() throws Exception {
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
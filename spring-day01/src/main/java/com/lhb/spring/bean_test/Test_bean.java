package com.lhb.spring.bean_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class Test_bean {

    @Test
    public void testPerson(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println("构造方法注入");
        System.out.println(person.toString());
    }

    @Test
    public void testSetterPerson(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println("Setter 方法注入");
        System.out.println(person.toString());
    }
}

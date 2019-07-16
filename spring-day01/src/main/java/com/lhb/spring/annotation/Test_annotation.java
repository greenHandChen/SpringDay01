package com.lhb.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class Test_annotation {

    @Test
    public void test_annotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        Person person1 = (Person) applicationContext.getBean("person1");
        person1.sayHello();
    }
}

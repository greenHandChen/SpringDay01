package com.ljx.test;

import com.ljx.entry.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml") ;
        Person person = (Person) applicationContext.getBean("user");
        System.out.println(person);
    }
}

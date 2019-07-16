package com.hand.TestSpring;

import com.hand.TestSpring.Controller.AnnotationController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestS {
    @Test
    public void test1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans2.xml");
        Person person=(Person)applicationContext.getBean("person1");
        person.SayHello();
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans2.xml");
        AnnotationController annotationController=(AnnotationController)applicationContext.getBean("annotationController");
        annotationController.addUser();
    }


}

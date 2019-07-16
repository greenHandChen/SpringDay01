package com.frank.spring.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person = (Person) applicationContext.getBean("person1");
//        person.sayHello();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationController annotationController = (AnnotationController)applicationContext.getBean("annotationController");
        annotationController.addUser();

    }


}

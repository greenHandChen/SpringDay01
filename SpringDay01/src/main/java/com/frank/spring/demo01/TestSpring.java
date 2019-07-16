package com.frank.spring.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("芜湖班的同学们好");
        System.out.println(helloSpring.getInfo());
        
    }

}

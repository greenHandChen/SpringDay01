package com.sise.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("芜湖班的同学们大家好");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = context.getBean("helloSpring",HelloSpring.class);
        helloSpring.setInfo("spring:芜湖班的同学们大家好");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void test1(){
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDiSpring(diSpring);
        System.out.println(helloSpring.getDiSpring());
    }

    @Test
    public void now1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = context.getBean("helloSpring",HelloSpring.class);
        System.out.println(helloSpring.getDiSpring());
    }


}

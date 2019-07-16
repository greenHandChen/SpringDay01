package com.yonye.spring;

import com.yonye.controller.AnnotationController;
import com.yonye.serviceImpl.AnnotationRepositoryImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void before(){
        HelloSpring helloSpring=new HelloSpring();

        helloSpring.setInfo("芜湖班的同学们好！！！");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        //第一步：根据xml配置文件生成，spring上下文
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        //第二部：根据bean的id获取bean
        HelloSpring helloSpring=(HelloSpring)applicationContext.getBean("helloSpring");
        //第三步：使用
        helloSpring.setInfo("spring:芜湖班的同学们好！！！");
        System.out.print(helloSpring.getInfo());

        AnnotationController annotationRepository=(AnnotationController)applicationContext.getBean("annotationController");
        annotationRepository.addUser();
    }
}

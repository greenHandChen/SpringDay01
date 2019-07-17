package com.yonye.controller;


import com.yonye.service.IAnnotationService;
import com.yonye.spring.HelloSpring;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


public class AnnotationController {



    private IAnnotationService annotationService;


//    public void setAnnotationService(IAnnotationService annotationService){
//        this.annotationService=annotationService;
//    }

    public void addUser(){
        System.out.println("准备开始添加用户。。。。");

        annotationService.addUser();
    }

    @Test
    public void now1(){
        //第一步：根据xml配置文件生成，spring上下文
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        //第二部：根据bean的id获取beanclass
        HelloSpring helloSpring=(HelloSpring)applicationContext.getBean("helloSpring");
//        //第三步：使用
        helloSpring.setInfo("spring:芜湖班的同学们好！！！");
        System.out.print(helloSpring.getInfo());


    }
}

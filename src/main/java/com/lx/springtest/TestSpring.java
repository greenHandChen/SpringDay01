package com.lx.springtest;

import com.lx.springtest.Config.SpringConfig;
import com.lx.springtest.Controller.AnnotationController;
import com.lx.springtest.Entity.Person_two;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("大家好");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        //加载上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取bean
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        MyBeanPostProcessor myBeanPostProcessor = (MyBeanPostProcessor) applicationContext.getBean("myBeanPostProcessor");
        helloSpring.setInfo("大家好");
        System.out.println(helloSpring.getInfo());

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        //class java.util.ArrayList
        //class java.util.LinkedHashSet
        //class java.util.LinkedHashMap
        System.out.println(collectionBean.getList().getClass());
        System.out.println(collectionBean.getSet().getClass());
        System.out.println(collectionBean.getMap().getClass());
    }

    @Test
    public void after(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_two.xml");
        Person_two person_two = (Person_two) applicationContext.getBean("person_two");
        person_two.sayHello();

        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.say();
    }

    @Test
    public void three(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_three.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void four(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        annotationConfigApplicationContext.close();
    }
}

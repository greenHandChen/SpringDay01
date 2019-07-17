package com.hand;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TEST {
    @Test
    public void test1(){
        HelloSpring helloSpring=new HelloSpring();
        helloSpring.setInfo("111111");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring=(HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("222222");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void test3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring=(HelloSpring)applicationContext.getBean("helloSpring");
        DISpring diSpring=new DISpring();
        diSpring.setStr("333333");
        helloSpring.setDiSpring(diSpring);
        System.out.println(helloSpring.getDiSpring());
    }
    @Test
    public void test4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring2 helloSpring2=(HelloSpring2)applicationContext.getBean("helloSpring2");
    }
    @Test
    public void test5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person)applicationContext.getBean("person");
        System.out.println(person.toString());
    }
    @Test
    public void test6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Person2 person2=(Person2) applicationContext.getBean("person2");
        System.out.println(person2.toString());
    }
    @Test
    public void test7(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.toString());
    }
    @Test
    public void test8(){

    }
}

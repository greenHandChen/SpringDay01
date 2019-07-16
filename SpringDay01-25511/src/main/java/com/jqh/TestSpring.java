package com.jqh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void test1() {
        FirstSpring firstSpring = new FirstSpring();

        DISpring diSpring = new DISpring();

        firstSpring.setDiSpirng(diSpring);

        firstSpring.helloDI();
    }


    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        FirstSpring firstSpring = (FirstSpring) applicationContext.getBean("firstSpring");

        firstSpring.helloDI();
    }

    @Test
    public void testSet(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person)applicationContext.getBean("person");

        System.out.println(person.toString());
    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");

        System.out.println(collectionBean.getArray());

        System.out.println(collectionBean.getList());
    }
}
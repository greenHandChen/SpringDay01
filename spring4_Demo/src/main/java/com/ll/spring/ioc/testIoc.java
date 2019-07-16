package com.ll.spring.ioc;

import com.ll.spring.entity.CollectionBean;
import com.ll.spring.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Map;

public class testIoc {

    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("welcome spring");
        System.out.println(helloSpring.getInfo());
        DISpring diSpring  = new DISpring();
        helloSpring.setDiSpring(diSpring);
        diSpring.helloDI("Hello DI");
    }

    @Test
    public void now(){
        //第一步加载applicationContext
        HelloSpring helloSpring = null;
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\spring4_Demo\\src\\main\\resources\\spring-context.xml");
//        helloSpring = (HelloSpring) applicationContext.getBean("spring");
        //第二步获取bean实例
        helloSpring = applicationContext.getBean("spring",HelloSpring.class);
        HelloSpring helloSpring2 = applicationContext.getBean("spring",HelloSpring.class);
        helloSpring.setInfo("this is my SpringIoc Test");
        helloSpring.getDiSpring().helloDI("hello spring di");
        System.out.println(helloSpring.getInfo());
        System.out.println("==>" + helloSpring.hashCode());
        System.out.println("==>" + helloSpring2.hashCode());

        helloSpring.service();
        applicationContext.close();

    }
    @Test
    public void IocProperties(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        Person person = null;
        person = (Person) context.getBean("person2");
        System.out.println(person);
    }

    @Test
    public void IocCollectionBean(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        CollectionBean collectionBean = null;
        collectionBean = context.getBean("collectionBean",CollectionBean.class);
        System.out.println(collectionBean);
        Map<Integer, String> map = collectionBean.getMap();
        map.forEach((a,b) -> System.out.println("the key of " + a + " and the value is " + b));
        System.out.println("set of collection class type is：" + collectionBean.getSet().getClass());
        System.out.println("arr of collection class type is：" + collectionBean.getArray().getClass());
        System.out.println("list of collection class type is：" + collectionBean.getList().getClass());
        System.out.println("map of collection class type is：" + collectionBean.getMap().getClass());

    }

}

package com.hph.com.hph.IocTest;

import com.hph.Ioc.CollectionBean;
import com.hph.Ioc.HelloSpring;
import com.hph.Ioc.Person;
import com.hph.annotaiton_h.AnnotationController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

    @Autowired
    AnnotationController annotationController;

    @Test
    public void testHelloSpring() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("helloworld");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void testHelloSpringAndDi() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("helloworld");
        System.out.println(helloSpring.getDiSpring().getStr());
    }

    @Test
    public void testPersonConstructor() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }

    @Test
    public void testPersonSetter() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person.toString());
    }

    @Test
    public void testCollectionBean() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.getArray()[0]);
        System.out.println(collectionBean.getList().get(0));
        System.out.println(collectionBean.getMap().get("篮球"));
        System.out.println(collectionBean.getSet().contains("北京"));
    }

    @Test
    public void testCompoment() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("annotations-beans.xml");
        com.hph.annotaiton_h.Person person = (com.hph.annotaiton_h.Person) applicationContext.getBean("person01");
        person.sayHello();
    }

    @Test
    public void testService() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("annotations-beans.xml");
        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();
    }
}

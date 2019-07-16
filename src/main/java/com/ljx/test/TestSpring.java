package com.ljx.test;
import com.ljx.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /*
     * 通过构造方式注入
     */

    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService ps = (PersonService) ctx.getBean("personService");
        ps.printMsg();
        ps.persist();
    }

    /*
     * 通过setter方式注入
     */

    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService ps = (PersonService) ctx.getBean("personServiceset");
        ps.printMsg();
        ps.persist();

    }

    /*
     * 自动扫描机制
     */

    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
        PersonService ps = (PersonService) ctx.getBean("personServiceImpl");
        ps.printMsg();
        ps.persist();

    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService ps = (PersonService) ctx.getBean("personServiceImpl");
        ps.printMsg();
        ps.persist();
    }

}


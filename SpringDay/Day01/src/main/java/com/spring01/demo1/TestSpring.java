package com.spring01.demo1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangjie_fourth on 2019/7/16.
 */
public class TestSpring {


    @org.junit.Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDiSpring(diSpring);

        System.out.println(helloSpring.helloDI());
    }

    @Test
    public void now () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.helloDI());

    }

}

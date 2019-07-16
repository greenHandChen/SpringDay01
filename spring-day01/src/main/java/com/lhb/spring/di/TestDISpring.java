package com.lhb.spring.di;

import com.lhb.spring.ioc.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class TestDISpring {
    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDISpring(diSpring);
        System.out.println(helloSpring.helloDI());

    }

    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.helloDI());
    }





}

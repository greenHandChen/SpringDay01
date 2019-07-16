package com.lhb.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class TestIoc {

    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("芜湖培训7月班");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("芜湖7月班培训");
        System.out.println(helloSpring.getInfo());

    }

}

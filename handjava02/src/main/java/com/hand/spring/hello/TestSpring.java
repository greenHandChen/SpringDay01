package com.hand.spring.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 15:42
 */
public class TestSpring {

    @Test
    public void beforce() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("芜湖班的同学你们好!");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("芜湖班的同学你们好! - spring");
        System.out.println(helloSpring.getInfo());
    }
}

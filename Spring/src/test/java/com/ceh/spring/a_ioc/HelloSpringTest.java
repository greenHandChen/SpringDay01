package com.ceh.spring.a_ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloSpringTest {

    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void now() {
        /*// 第一步：根据 xml配置文件生成, spring上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 第二部: 根据 bean的 id获取 bean
        HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
        // 第三步: 使用
        helloSpring.setInfo("芜湖班的同学们好！");
        System.out.println(helloSpring.getInfo());*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
        helloSpring.setInfo("芜湖班的同学们好！");
        System.out.println(helloSpring.helloDI());


    }
}
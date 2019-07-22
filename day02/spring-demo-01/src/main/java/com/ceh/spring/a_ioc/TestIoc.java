package com.ceh.spring.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class TestIoc {
    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("hello everyone");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        // 第一步加载applicationContext
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day01\\培训内容\\test\\spring-demo-01\\src\\main\\resources\\com\\ceh\\spring\\a_ioc\\applicationContext.xml");
        // 第二步通过getBean获取bean
        HelloSpring helloSpring =  applicationContext.getBean("helloSpring",HelloSpring.class);
        helloSpring.setInfo("hello spring ioc");
        System.out.println(helloSpring.getInfo());
    }
}

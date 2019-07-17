package com.hand.zhang.test;

import com.hand.zhang.bean.SpringHello;
import com.hand.zhang.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestSpring
 * Author:ZhangChunjia
 * Date:2019/7/16 10:14
 */
public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
        SpringHello springHello=new SpringHello();
        springHello.getInfo();
    }

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("conf/beans.xml");
        User user=(User) context.getBean("user");
        System.out.println(user.toString());
    }

}

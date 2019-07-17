package com.hand.test;


import com.hand.controller.UserController;
import com.hand.pojo.HelloSpring;
import com.hand.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testIOC() {
        String resource = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("hello Spring");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void testDI() {
        String resource = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.helloDI());
    }

    @Test
    public void testSetter(){
        String resource = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        User user=(User) applicationContext.getBean("user");
        System.out.println(user.toString());
    }

    @Test
    public void testAutowired() {
        String resource = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resource);
        UserController userController = applicationContext.getBean(UserController.class);
        userController.hello();
    }
}

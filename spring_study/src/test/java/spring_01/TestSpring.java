package spring_01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01.HelloSpring;

public class TestSpring {
//    @Test
//    public  void before(){
//        HelloSpring helloSpring=new HelloSpring();
//        helloSpring.setInfo("Hello,大家好");
//        System.out.println(helloSpring.getInfo());
//    }

//    @Test
//    public void now1(){
//        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_01/spring.xml");
//
//        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
//
//        helloSpring.setInfo("hello,我是佳佳辉");
//        System.out.println(helloSpring.getInfo());
//    }

    @Test
      public void now1(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_01/spring.xml");

        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");

        System.out.println(helloSpring.helloDI());
    }
}

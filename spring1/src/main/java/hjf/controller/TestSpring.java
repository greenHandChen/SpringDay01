package hjf.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void before(){
        HelloSpring helloSpring=new HelloSpring();
        helloSpring.setInfo("嘻嘻嘻");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void now (){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring=(HelloSpring)applicationContext.getBean("helloSpring");
        helloSpring.setInfo("hhhhh");
        System.out.println(helloSpring.getInfo());
    }

//    @Test
//    public void before（）{
//        HelloSpring helloSpring = new HelloSpring();
//        DISpring diSpring=new DISpring();
//        helloSpring.setDiSpring(diSpring);
//        System.out.println(helloSpring.helloDI());
//    }
}

package test;


import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.HelloSpring;

/**
 * Created by zq on 2019/7/16
 */
public class SpringTest {

    @Test
    public void before(){
        HelloSpring helloSpring =new HelloSpring();
        helloSpring.setInfo("zq啦啦啦");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void now(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("Spring:ZQ拉拉");
         System.out.println(helloSpring.getInfo());
        //System.out.println(helloSpring.helloDI());

    }
}

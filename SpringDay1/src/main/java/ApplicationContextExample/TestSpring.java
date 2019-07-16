package ApplicationContextExample;

import ApplicationContextExample.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {
    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("hello Spring");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now() {
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationXML/applicationContext.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\workspace\\SpringDay1\\src\\main\\resources\\applicationXML\\applicationContext.xml");

        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("你好啊");
        System.out.println(helloSpring.getInfo());
    }
}

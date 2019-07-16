import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloSpringTest {



    @Test
    public void before(){
        HelloSpring helloSpring=new HelloSpring();
        helloSpring.setInfo("芜湖培训同学");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void t2(){
        //获取配置文件
        ApplicationContext applicationContextn=new ClassPathXmlApplicationContext("/beans.xml");
        //获取bean名字，进行实例化
        HelloSpring helloSpring=(HelloSpring)applicationContextn.getBean("helloSpring");
//        使用
        helloSpring.setInfo("芜湖培训同学");
        System.out.println(helloSpring.getInfo());
    }
}
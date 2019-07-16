package MavenTest.spring.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void before(){
        HelloSpring hellospring=new HelloSpring();
        hellospring.setInfo("wuhu");
        System.out.println(hellospring.getInfo());
    }

    @Test
    public void now(){
        //第一步：根据xml配置生成，spring上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //第二步：根据bean的id获取bean
        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        //第三步：使用
        helloSpring.setInfo("spring:大家好");
        System.out.println(helloSpring.getInfo());
    }
}

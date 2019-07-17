package xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(" xmlConfig/Beans.xml");
        HelloSpring helloSpring = (HelloSpring) ac.getBean("helloSpring");
        helloSpring.setInfo("你好，Spring");
        System.out.println(helloSpring.getInfo());
        helloSpring.helloDI();
        ac.registerShutdownHook();
    }
}

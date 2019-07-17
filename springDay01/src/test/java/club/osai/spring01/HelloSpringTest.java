package club.osai.spring01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

    @Test
    public void getInfo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring01/beans.xml");
        HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        helloSpring.setInfo("helloSpring");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        diSpring.setHello("hhhhhhh");
        helloSpring.setDiSpring(diSpring);
        System.out.println(helloSpring.getDiSpring().getHello());
    }

    @Test
    public void now() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club.osai.spring01/beans.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring01/beans.xml");
        HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        helloSpring.setDiSpringWithStirng("helloSpring helloSpring");
        System.out.println(helloSpring.getDiSpring().getHello());

    }


}
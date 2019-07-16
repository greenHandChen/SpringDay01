package club.osai.spring02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
//        HelloSpring helloSpring = applicationContext.getBean("helloSpring1", HelloSpring.class);
//        helloSpring.setInfo("test");
//        System.out.println(helloSpring.getInfo());
//
    }

}
package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypePersonTest {

    /**
     * 测试基于注解的多例的依赖注入
     */

    @Test
    public void sayHello() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring03/beans.xml");
        PrototypePerson prototypePerson1 = applicationContext.getBean("prototypePerson", PrototypePerson.class);
        PrototypePerson prototypePerson2 = applicationContext.getBean("prototypePerson", PrototypePerson.class);
        prototypePerson1.sayHello();
        System.out.println(prototypePerson1 == prototypePerson2);
    }
}
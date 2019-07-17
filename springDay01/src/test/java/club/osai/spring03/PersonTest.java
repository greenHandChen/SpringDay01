package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    /**
     * 测试基于注解的单例的依赖注入
     */
    @Test
    public void sayHello() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring03/beans.xml");
        Person person = applicationContext.getBean("person", Person.class);
        person.sayHello();

    }
}
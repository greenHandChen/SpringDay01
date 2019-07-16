package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void sayHello() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring03/beans.xml");
        Person person = applicationContext.getBean("person", Person.class);
        person.sayHello();

    }
}
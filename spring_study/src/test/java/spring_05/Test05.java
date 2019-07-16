package spring_05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void comScan(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_05/spring.xml");

        Person person= (Person) applicationContext.getBean("person1");

        person.sayHello();
    }
}

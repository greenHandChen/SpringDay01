package spring_03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01.HelloSpring;

public class Test03 {
    @Test
    public void constr(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_03/spring_03.xml");

      Person person= (Person) applicationContext.getBean("person");

        System.out.println(person.toString());
    }
    }


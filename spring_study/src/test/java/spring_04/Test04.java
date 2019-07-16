package spring_04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_03.Person;

public class Test04 {
    @Test
    public void constr(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_04/spring.xml");

        CollectionBean colection= (CollectionBean) applicationContext.getBean("colection");

        System.out.println(colection.toString());
    }
}

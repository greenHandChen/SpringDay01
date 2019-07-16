package ConstructorArgExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonConstructorTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\workspace\\SpringDay1\\src\\main\\resources\\applicationXML\\applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }

}

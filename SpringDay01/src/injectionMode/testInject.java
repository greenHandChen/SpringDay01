package injectionMode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testInject {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injectionMode/Beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());

        Person2 person2 = (Person2) applicationContext.getBean("person2");
        System.out.println(person2.toString());
    }
}

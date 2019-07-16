package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationBeanTest {

    @Test
    public void person() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Person person = context.getBean("person", Person.class);
        person.sayHello();
    }
}
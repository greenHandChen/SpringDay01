package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationBeanTest {

    @Test
    public void person() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        person1.sayHello();
        person2.sayHello();
    }
}
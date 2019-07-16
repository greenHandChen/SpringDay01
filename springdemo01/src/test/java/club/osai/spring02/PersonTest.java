package club.osai.spring02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    /**
     * 单例模式
     */
    @Test
    public void singlePerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
        Person singlePerson1 = applicationContext.getBean("singlePerson", Person.class);
        Person singlePerson2 = applicationContext.getBean("singlePerson", Person.class);
        System.out.println(singlePerson1 == singlePerson2);

        System.out.println(singlePerson1);
        System.out.println(singlePerson2);
    }

    /**
     * 多例模式
     */
    @Test
    public void prototypePerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
        Person singlePerson1 = applicationContext.getBean("prototypePerson", Person.class);
//        Person singlePerson2 = applicationContext.getBean("prototypePerson", Person.class);
//        System.out.println(singlePerson1 ==singlePerson2);
//
//        System.out.println(singlePerson1);
//        System.out.println(singlePerson2);
    }

    /**
     * 通过构造方法注入
     */
    @Test
    public void constructorPerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
        Person constructorPerson = applicationContext.getBean("constructorPerson", Person.class);
        System.out.println(constructorPerson.toPrint());
    }

    /**
     * 通过SET方法注入
     */
    @Test
    public void setPerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
        Person constructorPerson = applicationContext.getBean("setPerson", Person.class);
        System.out.println(constructorPerson.toPrint());
    }

}
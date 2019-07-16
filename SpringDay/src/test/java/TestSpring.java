import SpringStudy.Annotion.Dao.PersonMapper;
import SpringStudy.Annotion.Enity.Person;
import SpringStudy.Annotion.Service.UserService;
import SpringStudy.SpringDi.CollectionBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import SpringStudy.SpringDi.Pserson;

public class TestSpring {

    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("Hello spring!");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void after_ioc() {
        /**
         * 加载Spring配置文件方式：
         * 1.加载ClassPath
         *   使用new classPathXmlApplicationContext("配置文件")
         * 2.加载配置文件磁盘路径
         *   使用new FileSystemXmlApplicationContext("配置文件路径")
         * **/
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-config.xml");
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        helloSpring.setInfo("hello spring!");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void BeanScope() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.close();
    }

    @Test
    public void SpringDi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Pserson pserson = (Pserson) context.getBean("pserson");
        System.out.println(pserson.toString());
    }

    @Test
    public void SpringDi2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
        System.out.println(collectionBean.toString());
    }

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonMapper  personMapper = (PersonMapper) context.getBean("personMapper");
        Person person = new Person();
        person.setName("张三");
        person.setAge(26);
        person.setAddress("安徽芜湖");
        System.out.println(personMapper.addUser(person));
    }
}
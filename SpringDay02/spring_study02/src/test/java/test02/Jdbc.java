package test02;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jdbc {

    @Test
    public void TestJdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test02/spring.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(3L);
        user.setUsername("飞鸟");
        user.setPassword("1234567865");
        userDao.update(user);
    }


}

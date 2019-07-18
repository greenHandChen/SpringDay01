package test04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test04.User;
import test04.UserDao;

public class Jdbc {

    @Test
    public  void  JdbcTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test04/spring.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(3L);
        userDao.delete(user);
    }
}

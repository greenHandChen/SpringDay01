package test03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test03.UserDao;

public class Jdbc {

    @Test
    public  void  JdbcTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test03/spring.xml");
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(4L);
        userDao.delete(user);
    }
}

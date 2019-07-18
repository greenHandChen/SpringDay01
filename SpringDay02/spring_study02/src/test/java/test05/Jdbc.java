package test05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test05.User;
import test05.UserDao;

public class Jdbc {

    @Test
    public  void  JdbcTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test05/spring.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        User user = new User();
        user.setId(1L);
        System.out.println(userDao.getUserById(user).toString());
        System.out.println(userDao.getUsers());
    }
}

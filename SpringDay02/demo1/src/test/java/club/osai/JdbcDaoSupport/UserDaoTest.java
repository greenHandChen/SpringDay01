package club.osai.JdbcDaoSupport;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void update() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc-support.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        user.setPassword("111");
        user.setUsername("11111ccc");

        userDao.update(user);

    }

    @Test
    public void delete() {


    }
    @Test
    public void getUserById(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc-support.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        User userById = userDao.getUserById(user);
        System.out.println(userById);

    }  @Test
    public void getUser(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc-support.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        List<User> users = userDao.getUser();
        System.out.println(users);

    }
}
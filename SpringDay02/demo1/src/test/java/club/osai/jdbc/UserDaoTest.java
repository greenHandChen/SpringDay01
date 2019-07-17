package club.osai.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void update1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        user.setPassword("111");
        user.setUsername("chenquan");

        userDao.update(user);

    }

    @Test
    public void update2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc-druid.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        user.setPassword("111");
        user.setUsername("chenquan");

        userDao.update(user);
    }

    @Test
    public void delete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc-druid.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(2L);
        userDao.delete(user);
    }
}
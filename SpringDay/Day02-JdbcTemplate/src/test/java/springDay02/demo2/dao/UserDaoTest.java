package springDay02.demo2.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDay02.demo2.pojo.User;

import static org.junit.Assert.*;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class UserDaoTest {

    @Test
    public void update() throws Exception {
        User user = new User();
        user.setId(3L);
        user.setUsername("WANGJIE");
        user.setPassword("123456");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo2.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        userDao.update(user);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId(3L);
        user.setUsername("WANGJIE");
        user.setPassword("123456");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo2.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        userDao.delete(user);
    }

}
package springDay02.demo3.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDay02.demo3.pojo.User;

import static org.junit.Assert.*;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class UserDaoTest {
    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setId(3L);
        user.setUsername("WANGJIE");
        user.setPassword("123456");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo3.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        userDao.insert(user);
    }

}
package club.osai.dao;

import club.osai.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    @Test
    public void findUser() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserDao bean = applicationContext.getBean("userDao",UserDao.class);

        User userById = bean.findUser(10L);
        System.out.println(userById);
    }
}
package com.ceh.spring.g_query;

import com.ceh.spring.a_domain.User;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.logging.Logger;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class TestHikari {
    //    private static final Logger logger = (Logger) LoggerFactory.getLogger(TestHikari.class);
    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day02\\培训内容\\test\\spring-day-02\\src\\main\\java\\com\\ceh\\spring\\g_query\\applicationContext.xml");
    }

    @Test
    public void testUserDao1() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao.querySimple01());
    }

    @Test
    public void testUserDao2() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(2L);
        System.out.println(userDao.querySimple02(user));
    }

    @Test
    public void testUserDao3() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(3L);
        System.out.println(userDao.findUserById(user));
    }

    @Test
    public void testUserDao4() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao.findUser());
    }
}

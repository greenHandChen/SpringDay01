package com.xyh.spring_mybaits;

import com.xyh.spring_mybaits.Dao.UserDao;
import com.xyh.spring_mybaits.Entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void findUserById() {
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        User user = userDao.findUserById(1);

        System.out.println(user.toString());
    }
}

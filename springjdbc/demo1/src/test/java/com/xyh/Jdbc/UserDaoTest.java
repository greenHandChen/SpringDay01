package com.xyh.Jdbc;

import com.xyh.Jdbc.Entity.User;
import com.xyh.Jdbc.Repository.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("spring_jdbc.xml");
    }

    @Test
    public void add() {
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setUsername("lala");
        user.setPassword("123");
        userDao.add(user);
    }

    @Test
    public void update(){
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(3);
        user.setUsername("haha");
        user.setPassword("12324");
        userDao.update(user);
    }

    @Test
    public void delete(){
        UserDao userDao=applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(3);
        userDao.delete(user);
    }
}

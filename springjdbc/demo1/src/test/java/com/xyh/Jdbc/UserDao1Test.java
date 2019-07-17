package com.xyh.Jdbc;

import com.xyh.Jdbc.Entity.User;
import com.xyh.Jdbc.Repository.UserDao1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserDao1Test {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("spring_jdbc.xml");
    }

    @Test
    public void select() {
        UserDao1 userDao1 = applicationContext.getBean("userDao1", UserDao1.class);
        User user = new User();
        user.setId(5);
        user = userDao1.getUserById(user);
        System.out.println(user.toString());
    }

    @Test
    public void selectAll() {
        UserDao1 userDao1 = applicationContext.getBean("userDao1", UserDao1.class);
        List<User> users=userDao1.selectAll();
        for (User user:users)
            System.out.println(user.toString());
    }
}

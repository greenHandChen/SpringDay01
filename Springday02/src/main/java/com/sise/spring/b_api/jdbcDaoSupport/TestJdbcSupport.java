package com.sise.spring.b_api.jdbcDaoSupport;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcSupport {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = context.getBean("userDao",UserDao.class);
    User user = new User();

    @Test
    public void testUserDao(){
        user.setId(3);
        user.setUsername("sky");
        user.setPassword("123");
        userDao.update(user);
    }
}

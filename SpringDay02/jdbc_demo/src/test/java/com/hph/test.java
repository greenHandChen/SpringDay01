package com.hph;

import com.hph.jdbcdemo.SupportDao;
import com.hph.jdbcdemo.User;
import com.hph.jdbcdemo.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(2L);
        user.setUsername("123321");
        user.setPassword("25018");
        userDao.update(user);
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_jdbcTemplate.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(4L);
        userDao.delete(user);
    }

    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_jdbcTemplate.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("hupenghao");
        user.setPassword("25018");
        userDao.insert(user);
    }

    @Test
    public void demo4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_dao.xml");
        SupportDao supportDao = (SupportDao) applicationContext.getBean("supportDao");
        User user = new User();
        user.setUsername("hupenghao");
        user.setPassword("25018");
        supportDao.insert(user);
    }

    @Test
    public void demo5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_jdbcTemplate.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(9L);
        User result = userDao.getUserById(user);
        System.out.println(result.getUsername());
    }

    @Test
    public void demo6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_jdbcTemplate.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> result = userDao.getUsers();
        System.out.println(result.isEmpty());
    }
}

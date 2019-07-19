package com.hand.test;

import com.hand.dao.UserDao;
import com.hand.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:SpringBybatisTest
 * Author:ZhangChunjia
 * Date:2019/7/19 19:40
 */
public class SpringBybatisTest {

    //    private ApplicationContext applicationContext;
//
//    @Before
//    public void init(){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/spring-1.xml");
//    }
    @Test
    public void testUserDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-1.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testUserMapper1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-2.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testUserMapper2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-3.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}

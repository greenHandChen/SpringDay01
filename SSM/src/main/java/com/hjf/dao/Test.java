package com.hjf.dao;

import com.hjf.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * ClassName:Test
 * Author:Hejunfeng
 * Date:2019/7/19 21:03
 */
public class Test {
    private UserDao userDao;

    @org.junit.Test
    public void findUserById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        System.out.println("少时诵诗书所");
        System.out.println(userDao.findUserById(10));
    }
}
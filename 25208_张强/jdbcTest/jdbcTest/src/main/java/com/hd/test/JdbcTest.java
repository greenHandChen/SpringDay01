package com.hd.test;

import com.hd.dao.UserDao;
import com.hd.utils.SSHConnection;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zq on 2019/7/17
 */
public class JdbcTest {

    @Test
    public void getUser(){
//        try {
//            SSHConnection.newInstance().startConnect();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.getUser();
        applicationContext.close();
    }
}

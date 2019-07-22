package com.ceh.mybatis;

import com.ceh.mybatis.dao.UserDao;
import com.ceh.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public class TestMybatis {

    @Test
    public void testA(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.findUserById(1);
    }

    @Test
    public void testB(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        UserMapper userDao = applicationContext.getBean("userMapper", UserMapper.class);
        userDao.findUserById(1);
    }
}

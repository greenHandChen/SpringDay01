package com.lzn.spring.dao.imp;

import com.lzn.spring.dao.IUserDao;
import com.lzn.spring.entity.UserEntity;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoImpTest {
    private IUserDao userDao;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/mySpring.xml");
        userDao = (UserDaoImp) applicationContext.getBean("userDao");
    }

    /**
     * @Description 整合 spring的 daoImp类型
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 20:32
     */
    @Test
    public void findUserById() {
        UserEntity userEntity = userDao.findUserById(new Integer(1));
        System.out.println(userEntity);
        System.out.println("findUserById() end");
    }
}
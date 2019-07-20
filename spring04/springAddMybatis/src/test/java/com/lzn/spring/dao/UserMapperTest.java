package com.lzn.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {
    private ApplicationContext applicationContext;
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("config/mySpring.xml");
    }

    /**
     * @Description Mapper代理类
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 20:32
     */
    @Test
    public void findUserById() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        System.out.println(userMapper.findUserById(new Integer(1)));

        System.out.println("findUserById() end");
    }
}
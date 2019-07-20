package com.itheima.ms.mapper;

import com.itheima.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

    private ApplicationContext context;
    @Before
    public void setUp() throws Exception{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception{
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}

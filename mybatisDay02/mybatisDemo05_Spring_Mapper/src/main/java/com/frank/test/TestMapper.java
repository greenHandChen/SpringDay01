package com.frank.test;


import com.frank.mapper.UserMapper;
import com.frank.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapper {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean(UserMapper.class);
        User user = userMapper.findUserById(25);
        System.out.println(user);
    }
}

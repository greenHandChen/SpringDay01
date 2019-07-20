package com.hjf.test;

import com.hjf.mapper.UserMapper;
import com.hjf.pojo.User;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Author:Hejunfeng
 * Date:2019/7/20 8:34
 */
public class Test {
    private  ApplicationContext applicationContext;
    @Before
    public void  init(){
        applicationContext=new ClassPathXmlApplicationContext("config/spring.xml");
    }


    @org.junit.Test
    public void testDemo1(){
        UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
        User user=userMapper.findUserById(10);
        System.out.print(user);

    }
}
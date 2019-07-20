package com.hjf.test;

import com.hjf.mapper.UserMapper;
import com.hjf.pojo.OrdersExt;
import com.hjf.pojo.User;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
    public void findUserById(){
        UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
        User user=userMapper.findUserById(10);
        System.out.print(user);
    }

    @org.junit.Test
    public void findOrdersExts(){
        UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
        OrdersExt ww=new OrdersExt();
        List<OrdersExt> a=userMapper.findOrdersExts(ww);
        System.out.print(a);
    }
}
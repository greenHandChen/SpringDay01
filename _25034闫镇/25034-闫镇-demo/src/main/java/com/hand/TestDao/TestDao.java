package com.hand.TestDao;

import com.hand.domain.OrdersExt;
import com.hand.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDao {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/springConfig.xml");
        UserMapper userMapper= applicationContext.getBean("userMapper",UserMapper.class);
        System.out.println(userMapper.findUserById(10));
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/springConfig.xml");
        UserMapper userMapper= applicationContext.getBean("userMapper",UserMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(10);
        System.out.println(userMapper.findOrdersExts(ordersExt));
    }
}

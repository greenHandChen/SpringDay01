package com.frank.test;


import com.frank.mapper.UserMapper;
import com.frank.pojo.OrderExt;
import com.frank.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMapper {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean(UserMapper.class);
        OrderExt orderExt = new OrderExt();
        List<OrderExt> list = userMapper.findOrderExts(orderExt);
        for (OrderExt ext : list) {
            System.out.println(ext);
        }
    }
}

package com.lzn.spring.dao;

import com.lzn.spring.entity.OrdersExt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class OrdersExtMapperTest {
    private ApplicationContext applicationContext;
    private OrdersExtMapper ordersExtMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("config/mySpring.xml");
        ordersExtMapper = (OrdersExtMapper) applicationContext.getBean("ordersExtMapper");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findOrdersExts() {
        OrdersExt ordersExt = new OrdersExt();
        List<OrdersExt> list = ordersExtMapper.findOrdersExts(ordersExt);
        System.out.println(list);
        System.out.println(list.size());

    }
}
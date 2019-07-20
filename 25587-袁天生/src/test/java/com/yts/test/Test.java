package com.yts.test;

import com.yts.beans.OrdersExt;
import com.yts.mapper.OrdersMapper;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Test {

    ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("config/application.xml");
    }



    @org.junit.Test
    public void testfindOrdersExts(){

        OrdersMapper mapper = applicationContext.getBean(OrdersMapper.class);

        OrdersExt ext = new OrdersExt();

        List<OrdersExt> ordersExts = mapper.findOrdersExts(ext);

        System.out.println(Arrays.asList(ordersExts));
    }
}

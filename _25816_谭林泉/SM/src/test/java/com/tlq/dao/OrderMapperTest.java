package com.tlq.dao;

import com.tlq.enity.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class OrderMapperTest {

    @Test
    public void OrderMapperTets() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper orderMapper = (OrderMapper) context.getBean("orderMapper");
        OrdersExt ordersExt = new OrdersExt();
        List<OrdersExt> ordersExtList = orderMapper.findOrdersExts(ordersExt);
        System.out.println(ordersExtList.size());
    }

}
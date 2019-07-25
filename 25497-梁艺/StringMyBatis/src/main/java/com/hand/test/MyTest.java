package com.hand.test;

import com.hand.entity.exts.OrderExts;
import com.hand.entity.exts.QueryOrder;
import com.hand.service.IOrderService;
import com.hand.service.impl.OrdersServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    ApplicationContext context;
    IOrderService orderService;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void test01() {
        orderService = context.getBean("orderService", OrdersServiceImpl.class);
        QueryOrder queryOrder = new QueryOrder();
        List<OrderExts> orderExtsList = orderService.findOrderExts(queryOrder);
        for(OrderExts orderExts:orderExtsList){
            System.out.println(orderExts);
        }
    }
}

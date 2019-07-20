package com.xyh;

import com.xyh.Entity.OrdersExts;
import com.xyh.Entity.User;
import com.xyh.Mapper.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrderMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test(){
        OrdersMapper ordersMapper=applicationContext.getBean("ordersMapper", OrdersMapper.class);
        OrdersExts ordersExts=new OrdersExts();
        ordersExts.setName("台式");
        List<OrdersExts> ordersExts1=ordersMapper.findOrdersExts(ordersExts);

        System.out.println("-----------------分割-------------------");
        for(OrdersExts ordersExts2:ordersExts1)
            System.out.println(ordersExts2.toString()+ ordersExts2.getUser().toString());
    }
}

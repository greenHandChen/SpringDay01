package com.sise.test.mapper;

import com.sise.test.po.OrdersExt;
import com.sise.test.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrdersMapperTest {

    private ApplicationContext context;
    @Before
    public void setUp() throws Exception{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void testFindOrdersExts() throws Exception{
        OrdersMapper ordersMapper = context.getBean("ordersMapper",OrdersMapper.class);
        List<User> ordersExts = ordersMapper.findOrdersExts();
        for(int i=0;i<ordersExts.size();i++){

            System.out.println(ordersExts.get(i).getOrders());
        }



    }
}

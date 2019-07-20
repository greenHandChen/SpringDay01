package com.txz.mybatis.test;

import com.txz.mybatis.domain.OrdersExt;
import com.txz.mybatis.mapper.OrdersMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationConfig.xml");
        OrdersMapper userMapper = (OrdersMapper) applicationContext.getBean("userMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.getOrders().setNumber("1000010");
        ordersExt.setName("笔记本");
        ordersExt.setCreatetimestart("2015-02-01");
        ordersExt.setCreatetimeend("2015-02-05");
        ordersExt.setPricestart(Float.valueOf("3000"));
        ordersExt.setPriceend(Float.valueOf("6000"));
        List<OrdersExt> ordersExts = userMapper.findOrdersExts(ordersExt);
        for (OrdersExt s:ordersExts
             ) {
            System.out.println(s.toString());
        }
    }
}

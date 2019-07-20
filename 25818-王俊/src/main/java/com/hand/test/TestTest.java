package com.hand.test;

import com.hand.dao.OrdersDao;
import com.hand.pojo.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author: 王俊
 * @Date: 2019/7/20 15:31
 **/
public class TestTest {

    @Test
    public void testTime() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrdersDao ordersDao=applicationContext.getBean(OrdersDao.class);
        OrdersExt ordersExt=new OrdersExt();
        Date date=new Date();
        ordersExt.setCreateTime_start(date);
        ordersExt.setCreateTime_end(new Date());
        ordersDao.findOrderExts(ordersExt).forEach(System.out::println);
    }
    @Test
    public void testPrice(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrdersDao ordersDao=applicationContext.getBean(OrdersDao.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setPriceStart(300.0);
        ordersExt.setPriceEnd(7000.0);
        ordersDao.findOrderExts(ordersExt).forEach(System.out::println);
    }
}

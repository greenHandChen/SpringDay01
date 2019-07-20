package club.osai.dao;

import club.osai.po.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class OrderDaoTest {




    @Test
    public void findOrdersExts() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring.xml");
//        OrderDao bean = (OrderDao)applicationContext.getBean("orderDao");
        OrderDao bean = (OrderDao)applicationContext.getBean(OrderDao.class);

        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(1L);
        List<OrdersExt> ordersExts = bean.findOrdersExts(ordersExt);
        System.out.println(ordersExt);


    }
}
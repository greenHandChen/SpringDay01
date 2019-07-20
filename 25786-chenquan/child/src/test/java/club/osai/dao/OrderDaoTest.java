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

import static org.junit.Assert.*;

public class OrderDaoTest {




    @Test
    public void findOrdersExts() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring.xml");
        OrderDao bean = (OrderDao)applicationContext.getBean("orderDao");

        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setCreatetime(new Date());

    }
}
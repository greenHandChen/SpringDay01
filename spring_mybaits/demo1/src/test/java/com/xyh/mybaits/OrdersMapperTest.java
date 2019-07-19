package com.xyh.mybaits;

import com.xyh.mybaits.Entity.OrderDetail;
import com.xyh.mybaits.Entity.Orders;
import com.xyh.mybaits.Entity.OrdersExt;
import com.xyh.mybaits.Entity.User;
import com.xyh.mybaits.Mapper.OrdersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrdersMapperTest {

    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        String resource = "MybaitsConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void findOrdersAndUser(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts=ordersMapper.findOrdersAndUser();
        for (OrdersExt ordersExt:ordersExts)
            System.out.println(ordersExt);
    }

    @Test
    public void findOrdersAndUserRstMap(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts=ordersMapper.findOrdersAndUserRstMap();
        for (OrdersExt ordersExt:ordersExts)
            System.out.println(ordersExt);
    }

    @Test
    public void findOrdersAndDetailRstMap(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts=ordersMapper.findOrdersAndDetailRstMap();
        for (OrdersExt ordersExt:ordersExts) {
            System.out.println(ordersExt);
            List<OrderDetail> orderDetails=ordersExt.getOrderDetails();
            for(OrderDetail orderDetail:orderDetails)
                System.out.println(orderDetail.toString());
            System.out.println();
        }

    }

    @Test
    public void  findUserAndItemsRstMap(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<User> users=ordersMapper.findUserAndItemsRstMap();
        System.out.println(users);
        List<Orders> orders=users.get(1).getOrders();
        System.out.println(orders.size());
        List<OrderDetail> orderDetails=orders.get(0).getOrderDetails();
        System.out.println(orderDetails.size());
        for (OrderDetail orderDetail:orderDetails)
            System.out.println(orderDetail.toString()+orderDetail.getItems().toString());
    }

    @Test
    public void findOrderAndUserLazyLoading(){
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts=ordersMapper.findOrderAndUserLazyLoading();
        ordersExts.get(1).getUser();
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}

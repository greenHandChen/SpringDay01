package com.hand.test;

import com.hand.dao.OrderMapper;
import com.hand.entity.OrdersExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:ExtTest
 * Author:ZhangChunjia
 * Date:2019/7/19 10:08
 */
public class ExtTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/mybatis-1.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findOrdersExt() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setOrder_id(10);
        List<OrdersExt> list = orderMapper.findOrdersExt(ordersExt);
        sqlSession.close();
        for (OrdersExt ext : list) {
            System.out.println(String.valueOf(ext.getOrder_id()) + " " + String.valueOf(ext.getCreatetime())
                    + " " + ext.getNumber() + " " + ext.getNote()
                    + " " + ext.getUsername() + " " + ext.getAddress());
        }
        System.out.println(list);
    }

    @Test
    public void findOrdersUserResultMapTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setOrder_id(10);
        //User user=new User();
        //user.setUser_id(1);
        List<OrdersExt> list = orderMapper.findOrdersByResultMap(ordersExt);
        sqlSession.close();
        System.out.println(list);
        for (OrdersExt ext : list) {
            System.out.println(String.valueOf(ext.getOrder_id())
                    + " " + String.valueOf(ext.getUser_id())
                    + " " + ext.getNumber() + " " + ext.getNote()
                    + " " + ext.getUser().getUsername() + " " + ext.getAddress());
        }

    }

    @Test
    public void orderAndDetailsResultMapTest(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setOrder_id(10);
        List<OrdersExt> list = orderMapper.findOrdersAndDetails(ordersExt);
        sqlSession.close();
        for (OrdersExt ext : list) {
            System.out.println(ext);
        }
    }

    @Test
    public void lazyLoadTest(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setOrder_id(10);
        List<OrdersExt> list=orderMapper.findOrderAndLazyLoad(ordersExt);
        sqlSession.close();
        for (OrdersExt ext : list) {
            System.out.println(ext);
        }
    }
}

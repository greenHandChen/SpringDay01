package com.hand.test;

import com.hand.mapper.OrderMapper;
import com.hand.mapper.UserMapper;
import com.hand.pojo.Orders;
import com.hand.pojo.OrdersExt;
import com.hand.pojo.OrdersExt1;
import com.hand.pojo.OrdersExt2;
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
 * ClassName:Test1
 * Author:Hejunfeng
 * Date:2019/7/19 9:47
 */
public class Test1 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts=orderMapper.findOrdersExt(ordersExt);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void findOrdersByResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt1 ordersExt1 = new OrdersExt1();
        ordersExt1.setId(5);
        List<OrdersExt1> ordersExts=orderMapper.findOrdersByResultMap(ordersExt1);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void findOrdersAndOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt2 ordersExt2 = new OrdersExt2();
        ordersExt2.setId(5);
        List<OrdersExt2> ordersExts=orderMapper.findOrdersAndOrderDetail(ordersExt2);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt2> ordersExts=orderMapper.findOrderInfoByLazyLoad(4);
        System.out.println(ordersExts.get(0).getUser());
        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.findUserById(1);

        userMapper.findUserById(1);

        sqlSession.close();
    }



}
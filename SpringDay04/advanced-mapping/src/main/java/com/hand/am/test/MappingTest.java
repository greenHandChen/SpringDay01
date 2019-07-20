package com.hand.am.test;

import com.hand.am.dao.OrdersDao;
import com.hand.am.pojo.OrdersExt;
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
 * @Author: 王俊
 * @Date: 2019/7/19 9:29
 **/
public class MappingTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrderExt() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExtList = ordersDao.findOrdersExt(ordersExt);
        ordersExtList.forEach(System.out::println);
        sqlSession.close();
    }

    /**
     * 一对一
     */
    @Test
    public void findOrdersToResultMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        OrdersExt ordersExt = new OrdersExt();
        List<OrdersExt> ordersExtList = ordersDao.findOrdersToResultMap(ordersExt);
        ordersExtList.forEach(System.out::println);
        sqlSession.close();
    }

    /**
     * 一对多
     */
    @Test
    public void findOrdersAndOrderDetails() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        OrdersExt ordersExt = new OrdersExt();
        List<OrdersExt> ordersExtList = ordersDao.findOrdersAndOrderDetails(ordersExt);
        ordersExtList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void findOrderByLazyLoad() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        List<OrdersExt> ordersExtList = ordersDao.findOrderByLazyLoad(3);
        ordersExtList.forEach(System.out::println);
        sqlSession.close();
        double s = 0.0;
        int i = (int) s + 1;
    }
}

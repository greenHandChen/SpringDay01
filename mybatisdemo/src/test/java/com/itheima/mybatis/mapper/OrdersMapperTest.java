package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.OrdersExt;
import com.itheima.mybatis.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class OrdersMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        String resources ="SqlMapConfig.xml";
        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resources);
        //创建sqlsessionfactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void testFindOrdersAndUser(){
        SqlSession  sqlSession= sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndUser();
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void testFindOrdersAndUserRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndUserRstMap();
        sqlSession.close();
    }

    @Test
    public void testFindOrdersAndDetailRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> list = mapper.findOrdersAndDetailRstMap();
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void testFindUserAndItemsRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> list = mapper.findUserAndItemsRstMap();
        System.out.println(list);
        sqlSession.close();
    }

}
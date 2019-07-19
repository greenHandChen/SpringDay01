package com.txz.test;

import com.txz.domain.OrderDetail;
import com.txz.domain.OrderExt;
import com.txz.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void info() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> ordersExt = mapper.findOrdersExt(orderExt);
        System.out.println(ordersExt.get(0).getNumber());
        sqlSession.close();
    }

    @Test
    public  void findOrdersByResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> ordersByResultMap = mapper.findOrdersByResultMap(orderExt);
        System.out.println(ordersByResultMap.get(0).toString());
        sqlSession.close();
    }

    @Test
    public void findOrdersAndOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> ordersAndOrderDetail = mapper.findOrdersAndOrderDetail(orderExt);
        List<OrderDetail> orderDetails = ordersAndOrderDetail.get(0).getOrderDetails();
        for(OrderDetail od:orderDetails){
            System.out.println(od.toString());
        }
        sqlSession.close();
    }

    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderExt> orderInfoByLazyLoad = mapper.findOrderInfoByLazyLoad(4);
        System.out.println(orderInfoByLazyLoad.get(0).getUser().toString());
        sqlSession.close();
    }
}

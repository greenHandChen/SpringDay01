package com.hand.mapper;

import com.hand.pojo.OrdersExt;
import com.hand.pojo.OrdersExt1;
import com.hand.pojo.OrdersExt2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * ClassName:OrderMapperImpl
 * Author:Hejunfeng
 * Date:2019/7/19 9:54
 */
public class OrderMapperImpl implements OrderMapper {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }


    public List<OrdersExt> findOrdersExt(OrdersExt ordersExt) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<OrdersExt> ordersExts = sqlSession.selectList("orderMapper.findOrdersExt");
        sqlSession.close();
        return ordersExts;
    }

    public List<OrdersExt1> findOrdersByResultMap(OrdersExt1 orders) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<OrdersExt1> ordersExts1 = sqlSession.selectList("findOrdersByResultMap");
        sqlSession.close();
        return ordersExts1;
    }

    public List<OrdersExt2> findOrdersAndOrderDetail(OrdersExt2 orders2) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<OrdersExt2> ordersExts2 = sqlSession.selectList("findOrdersAndOrderDetail");
        sqlSession.close();
        return ordersExts2;
    }

    public List<OrdersExt2> findOrderInfoByLazyLoad(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<OrdersExt2> ordersExts2 = sqlSession.selectList("findOrderInfoByLazyLoad");
        sqlSession.close();
        return ordersExts2;
    }
}
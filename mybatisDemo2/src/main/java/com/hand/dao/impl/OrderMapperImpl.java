package com.hand.dao.impl;

import com.hand.dao.OrderMapper;
import com.hand.entity.OrdersExt;
import com.hand.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * ClassName:OrderMapperImpl
 * Author:ZhangChunjia
 * Date:2019/7/19 9:51
 */
public class OrderMapperImpl implements OrderMapper {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    @Override
    public List<OrdersExt> findOrdersExt(OrdersExt ordersExt) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<OrdersExt> list=sqlSession.selectList("findOrdersExt");
        return list;
    }

    @Override
    public List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<OrdersExt> list=sqlSession.selectList("findOrdersByResultMap");
        return list;
    }

    @Override
    public List<OrdersExt> findOrdersAndDetails(OrdersExt ordersExt) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<OrdersExt> list=sqlSession.selectList("findOrdersAndDetails");
        return list;
    }

    //延迟加载

    @Override
    public User findUserByIdLazyLoad(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("findUserByIdLazyLoad");
        return user;
    }

    @Override
    public List<OrdersExt> findOrderAndLazyLoad(OrdersExt ordersExt) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<OrdersExt> list=sqlSession.selectList("findOrderAndLazyLoad");
        return list;
    }
}

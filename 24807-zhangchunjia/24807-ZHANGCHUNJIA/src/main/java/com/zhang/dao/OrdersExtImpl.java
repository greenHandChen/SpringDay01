package com.zhang.dao;

import com.zhang.entity.OrdersExt;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * ClassName:OrdersExtImpl
 * Author:ZhangChunjia
 * Date:2019/7/20 15:37
 */
public class OrdersExtImpl implements OrdersExtDao {

    private SqlSessionFactory sqlSessionFactory;
    @Override
    public List<OrdersExt> findOrdersExts(OrdersExt ordersExt) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<OrdersExt> list=sqlSession.selectList("");
        return list;
    }
}

package com.hand.dao.impl;

import com.hand.bean.OrdersInfo;
import com.hand.dao.OrdersInfoDao;
import com.hand.mapper.OrdersInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersInfoDaoImpl implements OrdersInfoDao {

    @Autowired
    private OrdersInfoMapper ordersInfoMapper;

    @Override
    public OrdersInfo getOrdersInfoById(Integer id) {
        OrdersInfo ordersInfoById = ordersInfoMapper.getOrdersInfoById(id);
        return ordersInfoById;
    }
}

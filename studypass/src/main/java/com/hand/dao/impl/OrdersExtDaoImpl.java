package com.hand.dao.impl;

import com.hand.bean.OrdersExt;
import com.hand.dao.OrdersExtDao;
import com.hand.mapper.OrdersExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersExtDaoImpl implements OrdersExtDao {

    @Autowired
    private OrdersExtMapper ordersExtMapper;


    @Override
    public List<OrdersExt> findOrdersExts(OrdersExt ordersExt) {
        List<OrdersExt> ordersExts = ordersExtMapper.findOrdersExts(ordersExt);
        return ordersExts;
    }
}

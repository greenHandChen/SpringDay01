package com.hand.lq.service;

import com.hand.lq.dao.OrderMapper;
import com.hand.lq.pojo.OrdersExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<OrdersExt> findOrdersExts(OrdersExt ordersExt) {
        OrdersExt ordersExt2=new OrdersExt();
        return orderMapper.findOrdersExts(ordersExt2);
    }
}

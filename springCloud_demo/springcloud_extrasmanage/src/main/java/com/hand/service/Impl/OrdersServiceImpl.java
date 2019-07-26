package com.hand.service.Impl;

import com.hand.mapper.OrdersMapper;
import com.hand.pojo.Orders;
import com.hand.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2610:39
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> queryUserOrders() {
        return ordersMapper.findOrdersall();
    }
}

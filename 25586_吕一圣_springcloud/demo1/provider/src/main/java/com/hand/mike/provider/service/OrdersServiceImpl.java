package com.hand.mike.provider.service;

import com.hand.mike.provider.domain.Orders;
import com.hand.mike.provider.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW
            ,isolation = Isolation.SERIALIZABLE)
    public Orders getOrderById(Integer id) {
        return ordersMapper.getOrderById(id);
    }

    @Override
    public Integer deleteOrderById(Integer id) {
        return ordersMapper.deleteOrderById(id);
    }

    @Override
    public Integer addOrder(Orders order) {
        return ordersMapper.addOrder(order);
    }

    @Override
    public Integer updateOrder(Orders order) {
        return ordersMapper.updateOrder(order);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersMapper.getAllOrders();
    }

}

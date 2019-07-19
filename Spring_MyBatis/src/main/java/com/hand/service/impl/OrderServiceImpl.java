package com.hand.service.impl;

import com.hand.entity.OrdersUser;
import com.hand.mapper.OrdersMapper;
import com.hand.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    @Qualifier("orderMapper")
    private OrdersMapper ordersMapper;

    /**
     * 查询订单对应的用户
     * @param user_id
     * @return
     */
    public List<OrdersUser> getOrderAndUser(int user_id) {
        return ordersMapper.selectOrdersAndUser(user_id);
    }
}

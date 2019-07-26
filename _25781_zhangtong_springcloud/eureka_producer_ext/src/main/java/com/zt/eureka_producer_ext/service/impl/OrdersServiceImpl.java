package com.zt.eureka_producer_ext.service.impl;

import com.zt.eureka_producer_ext.dto.Orders;
import com.zt.eureka_producer_ext.mapper.OrdersMapper;
import com.zt.eureka_producer_ext.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 16:16
 */
@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;
    
    @Override
    public List<Orders> getOrdersByName(String username) {
        /**
         * @description: 
         * @author: invokerZt
         * @date: 2019-07-26 16:18
         * @param username: 
         * @return: java.util.List<com.zt.eureka_producer_ext.dto.Orders>
         */
        return ordersMapper.selectOrdersByName(username);
    }

    @Override
    public Orders getOrdersById(Integer id) {
        /**
         * @description: 
         * @author: invokerZt
         * @date: 2019-07-26 16:18
         * @param id: 
         * @return: com.zt.eureka_producer_ext.dto.Orders
         */
        return ordersMapper.selectOrdersById(id);
    }
}

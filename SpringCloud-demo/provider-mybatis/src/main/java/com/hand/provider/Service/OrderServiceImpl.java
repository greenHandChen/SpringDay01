/**
 * Created by Hsl
 * 2019/7/27 11:17
 */
package com.hand.provider.Service;

import com.hand.provider.mapper.OrderMapper;
import com.hand.provider.mapper.UserMapper;
import com.hand.provider.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements Orderservice {

    @Autowired
    private OrderMapper orderMapper ;

    @Override
    public Order findOrderByUserId(Integer id) {

        return orderMapper.findOrderByUserId(id);
    }
}

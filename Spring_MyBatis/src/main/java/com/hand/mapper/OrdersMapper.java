package com.hand.mapper;

import com.hand.entity.OrdersUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderMapper")
public interface OrdersMapper {
    /**
     * 查询订单对应的用户
     * @param user_id
     * @return
     */
    public List<OrdersUser> selectOrdersAndUser(int user_id);
}
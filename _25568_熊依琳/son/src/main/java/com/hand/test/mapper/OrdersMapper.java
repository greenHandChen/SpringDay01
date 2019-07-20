package com.hand.test.mapper;

import com.hand.test.po.OrdersEst;

import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/20 15:27
 * @Version 1.0
 */

public interface OrdersMapper {
      List<OrdersEst> findOrdersEst(OrdersEst ordersEst);
}

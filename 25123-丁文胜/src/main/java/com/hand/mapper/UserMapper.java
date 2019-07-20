package com.hand.mapper;

import com.hand.pojo.OrdersExt;
import com.hand.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findUserById(Integer id);


    List<OrdersExt> findOrderExt(OrdersExt ordersExt);
    List<OrdersExt> findOrderByResultMap(OrdersExt ordersExt);

    List<OrdersExt> findOrdersAndUserAndDetail(OrdersExt ordersExt);

    /**
     * @auther: dingwensheng
     * @description:根据订单id进行延迟加载查询
     * @date: 2019/7/19
     */
    List<OrdersExt> findOrderInfoBylazyLoad(Integer id);

}

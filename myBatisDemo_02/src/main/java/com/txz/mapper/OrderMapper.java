package com.txz.mapper;

import com.txz.domain.OrderExt;
import com.txz.domain.User;

import java.util.List;

public interface OrderMapper {
    //根据订单ID查询订单以及用户信息
    List<OrderExt> findOrdersExt(OrderExt orderExt);

    //根据订单ID查询订单以及用户信息Map
    List<OrderExt> findOrdersByResultMap(OrderExt orderExt);

    //根据订单ID查询订单，订单的明细以及用户信息
    List<OrderExt> findOrdersAndOrderDetail(OrderExt orderExt);

    //根据订单ID进行延迟加载查询
    List<OrderExt> findOrderInfoByLazyLoad(Integer id);

    //根据ID查询用户信息
    User findUserById(Integer user_id);

    //添加用户
    Integer addUser(User user);
}

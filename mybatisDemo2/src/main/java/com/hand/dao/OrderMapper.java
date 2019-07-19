package com.hand.dao;

import com.hand.entity.OrderDetails;
import com.hand.entity.OrdersExt;
import com.hand.entity.User;

import java.util.List;

public interface OrderMapper {
    //简单查询 resultType
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    //一对一查询 resultMap association标签
    List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt);
    //一对多查询 resultMap 继承一个一对一的表的resultMap collection标签
    List<OrdersExt> findOrdersAndDetails(OrdersExt ordersExt);
    //延迟加载
    User findUserByIdLazyLoad(Integer id);
    List<OrdersExt> findOrderAndLazyLoad(OrdersExt ordersExt);


}

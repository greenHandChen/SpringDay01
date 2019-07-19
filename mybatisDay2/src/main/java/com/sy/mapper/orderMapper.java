package com.sy.mapper;

import com.sy.bean.OrdersExt;
import com.sy.bean.User;

import java.util.List;

public interface orderMapper {

    User findUserById (Integer id);
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    List<OrdersExt> findOrdersExtRstmap(OrdersExt ordersExt);

    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);

    List<OrdersExt> findByOrderInfoBylazyLoad(Integer id);
}

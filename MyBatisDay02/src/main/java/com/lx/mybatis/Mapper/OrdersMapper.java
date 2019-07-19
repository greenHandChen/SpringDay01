package com.lx.mybatis.Mapper;

import com.lx.mybatis.Entity.OrdersExt;
import com.lx.mybatis.Entity.OrdersExt2;
import com.lx.mybatis.Entity.UserMany;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersByResultMap();
    List<OrdersExt2> findOrdersAndOrderDetail();
    List<UserMany> findUserAndItemsResultMap();

    // 根据订单ID进行延迟加载查询
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}

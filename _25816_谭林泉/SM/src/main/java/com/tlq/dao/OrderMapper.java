package com.tlq.dao;

import com.tlq.enity.OrdersExt;

import java.util.List;

/**
 * @Description: 订单Mapper
 * @Author: TanLinQuan
 * @Date: 2019/7/20 15:22
 * @Version: V1.0
 **/
public interface OrderMapper {
    
    
    /**
    * @Description: 查询订单明细
    * @Author: TanLinQuan
    * @Date: 2019/7/20 15:23
    * @params: [ordersExt]
    * @return: List<OrdersExt>
    **/
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
    
}

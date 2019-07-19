package com.zt.smybatis.mapper;

import com.zt.smybatis.domain.*;

import java.util.List;


/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-19 11:12
 */
public interface OrderMapper {

    OrderExt findOrderByResultType(OrderExt orderExt);

    OrderExt2 findOrdersByResultMap(OrderExt2 orderExt2);

    OrderExt3 findOrdersAndOrderDetail(OrderExt3 orderExt3);

    List<OrderDetailExt> findItemsAndOrdersDetail(Order order);

}

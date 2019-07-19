package com.hand.mapper;

import com.hand.pojo.OrdersExt;
import com.hand.pojo.OrdersExt1;
import com.hand.pojo.OrdersExt2;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface OrderMapper {
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    List<OrdersExt1> findOrdersByResultMap(OrdersExt1 orders1);
    List<OrdersExt2> findOrdersAndOrderDetail(OrdersExt2 orders2);
    List<OrdersExt2> findOrderInfoByLazyLoad(Integer id);

}

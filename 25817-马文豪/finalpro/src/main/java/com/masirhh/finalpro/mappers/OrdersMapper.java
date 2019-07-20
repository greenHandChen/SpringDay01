package com.masirhh.finalpro.mappers;

import com.masirhh.finalpro.beans.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}

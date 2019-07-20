package com.exam.mapper;

import com.exam.entity.Order;
import com.exam.entity.OrderExt;

import java.util.List;

public interface OrderMapper {

    public Order findOrderById(Integer id);

    public List<OrderExt> findOrderExt(OrderExt orderExt);

    public List<OrderExt> findDrderAndOrderDetail();
}

package com.ll.ms.mapper;

import com.ll.ms.po.OrderExt;

import java.util.List;

public interface OrderMapper {

    List<OrderExt> findOrdersExts(OrderExt orderExt);

}

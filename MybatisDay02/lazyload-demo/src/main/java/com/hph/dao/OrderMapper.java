package com.hph.dao;


import com.hph.entity.OrderExt;

import java.util.List;

public interface OrderMapper {

    List<OrderExt> findOrderExt(OrderExt orderExt);

    List<OrderExt> findOrderAndOrderDetail(OrderExt orderExt);

    List<OrderExt> findOrdersByRstMap(OrderExt orderExt);

    List<OrderExt> findOrderInfoByLazyLoad(Integer id);
}

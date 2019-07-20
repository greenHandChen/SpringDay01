package com.hph.dao;


import com.hph.entity.OrderExt;

import java.util.List;

public interface OrderMapper {

    List<OrderExt> findOrderExt(OrderExt orderExt);
}

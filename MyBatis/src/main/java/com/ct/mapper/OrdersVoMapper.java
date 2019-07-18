package com.ct.mapper;

import com.ct.domain.OrdersVo;

public interface OrdersVoMapper {
    OrdersVo findOrdersVoById(Integer id);
    OrdersVo findOrdersVoByIdEx(Integer id);
}

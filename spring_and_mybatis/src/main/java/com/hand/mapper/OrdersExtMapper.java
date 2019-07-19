package com.hand.mapper;

import com.hand.bean.OrdersExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersExtMapper {

    List<OrdersExt> getOrdersExt(@Param("id") Integer id);

}

package com.hand.dao;

import com.hand.vo.OrdersExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersExts(@Param("o") OrdersExt ordersExt);
}

package com.hand.dao;

import com.hand.domain.OrderExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailMapper {
    List<OrderExt> findOrdersAndOrderDetails(@Param("id")Integer id );
}

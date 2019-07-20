package com.hand.mybatis.mapper;

import com.hand.mybatis.pojo.OrdersExt;
import com.hand.mybatis.pojo.QueryVo;

import java.util.List;


public interface OrderMapper  {

    List<OrdersExt> findOrdersExts(QueryVo vo);
}

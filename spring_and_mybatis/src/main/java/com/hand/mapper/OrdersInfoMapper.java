package com.hand.mapper;

import com.hand.bean.OrdersInfo;
import org.apache.ibatis.annotations.Param;

public interface OrdersInfoMapper {

    OrdersInfo getOrdersInfoById(@Param("id") Integer id);

}

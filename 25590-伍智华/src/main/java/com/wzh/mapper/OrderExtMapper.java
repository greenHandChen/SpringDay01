package com.wzh.mapper;

import com.wzh.domain.OrderExt;

import java.util.List;
import java.util.Map;

public interface OrderExtMapper {
   List<OrderExt> findOrdersExts(Map map);
}

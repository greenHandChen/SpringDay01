package com.hand.spring_boot_day1.mapper;

import com.hand.spring_boot_day1.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
     List<Orders> findAll();
}

package com.hand.provider.mapper;


import com.hand.provider.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    Order findOrderByUserId(Integer id);
}

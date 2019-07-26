package com.example.dao;

import com.example.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    List<Order> getByUserId(Integer uid);
    Integer addOrder(Order order);
    /*Integer deleteOrder();
    Integer updateOrder();*/
}

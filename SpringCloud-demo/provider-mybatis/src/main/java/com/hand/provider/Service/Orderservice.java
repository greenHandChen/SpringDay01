package com.hand.provider.Service;

import com.hand.provider.pojo.Order;

public interface Orderservice {
    Order findOrderByUserId(Integer id);
}

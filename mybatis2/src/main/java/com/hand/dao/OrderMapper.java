package com.hand.dao;

import com.hand.domain.Orders;

public interface OrderMapper {
    Orders findOrderInfoByLazyLoad(int id);
}

package com.hand.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable {
    private static final long serialVersionUID = 1L;


    private User user;

    private Items items;

    private OrdersExt ordersExt;


    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public OrdersExt getOrdersExt() {
        return ordersExt;
    }

    public void setOrdersExt(OrdersExt ordersExt) {
        this.ordersExt = ordersExt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

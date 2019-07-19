package com.lx.mybatis.Entity;

import java.util.List;

public class UserMany extends User{
    private List<OrdersMany> ordersList;

    public List<OrdersMany> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<OrdersMany> ordersList) {
        this.ordersList = ordersList;
    }
}

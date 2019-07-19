package com.lx.mybatis.Entity;

import java.util.List;

public class OrdersMany extends Orders{
    private List<OrderDetilMany> orderDetails;

    public List<OrderDetilMany> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetilMany> orderDetails) {
        this.orderDetails = orderDetails;
    }
}

package com.lx.hand.domain;

import java.util.List;

public class OrdersMany extends Orders{
    private List<OrderDetilMany> orderDetails;

    private Float totalAmount;

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<OrderDetilMany> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetilMany> orderDetails) {
        this.orderDetails = orderDetails;
    }
}

package com.zt.smybatis.domain;

import java.util.List;

public class OrderDetailExt extends OrderDetail{

    private Integer odId;

    private Item items;

    private Order orders;

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderDetailExt{" +
                "odId=" + odId +
                ", items=" + items +
                ", orders=" + orders +
                '}';
    }
}
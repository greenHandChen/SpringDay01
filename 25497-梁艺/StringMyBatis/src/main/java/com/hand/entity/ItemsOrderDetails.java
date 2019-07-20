package com.hand.entity;

import java.util.Set;

public class ItemsOrderDetails {
    private Items items;
    private Set<OrderDetail> orderdetailset;

    public ItemsOrderDetails() {
    }

    public ItemsOrderDetails(Items items, Set<OrderDetail> orderdetailset) {
        this.items = items;
        this.orderdetailset = orderdetailset;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Set<OrderDetail> getOrderdetailset() {
        return orderdetailset;
    }

    public void setOrderdetailset(Set<OrderDetail> orderdetailset) {
        this.orderdetailset = orderdetailset;
    }

    @Override
    public String toString() {
        return "ItemsOrderDetails{" +
                "items=" + items +
                ", orderdetailset=" + orderdetailset +
                '}';
    }
}

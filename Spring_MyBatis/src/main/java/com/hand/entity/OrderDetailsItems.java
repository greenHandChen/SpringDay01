package com.hand.entity;

import java.util.Set;

public class OrderDetailsItems {
    private OrderDetail orderdetails;
    private Set<Items> itemset;

    public OrderDetailsItems() {
    }

    public OrderDetailsItems(OrderDetail orderdetails, Set<Items> itemset) {
        this.orderdetails = orderdetails;
        this.itemset = itemset;
    }

    public OrderDetail getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(OrderDetail orderdetails) {
        this.orderdetails = orderdetails;
    }

    public Set<Items> getItemset() {
        return itemset;
    }

    public void setItemset(Set<Items> itemset) {
        this.itemset = itemset;
    }

    @Override
    public String toString() {
        return "OrderDetailsItems{" +
                "orderdetails=" + orderdetails +
                ", itemset=" + itemset +
                '}';
    }
}

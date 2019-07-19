package com.hand.lq.pojo;

import java.io.Serializable;

public class OrderDetails implements Serializable {
    Integer id;
    Integer orders_id;
    Integer items_id;
    Integer items_num;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", orders_id=" + orders_id +
                ", items_id=" + items_id +
                ", items_num=" + items_num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(Integer items_id) {
        this.items_id = items_id;
    }

    public Integer getItems_num() {
        return items_num;
    }

    public void setItems_num(Integer items_num) {
        this.items_num = items_num;
    }
}

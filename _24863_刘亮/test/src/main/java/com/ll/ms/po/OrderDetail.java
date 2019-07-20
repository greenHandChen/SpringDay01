package com.ll.ms.po;

public class OrderDetail {

    private int id;
    private int orders_id;
    private int items_id;
    private int itemes_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getItemes_num() {
        return itemes_num;
    }

    public void setItemes_num(int itemes_num) {
        this.itemes_num = itemes_num;
    }

    public OrderDetail() {
    }

    public OrderDetail(int id, int orders_id, int items_id, int itemes_num) {
        this.id = id;
        this.orders_id = orders_id;
        this.items_id = items_id;
        this.itemes_num = itemes_num;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orders_id=" + orders_id +
                ", items_id=" + items_id +
                ", itemes_num=" + itemes_num +
                '}';
    }
}

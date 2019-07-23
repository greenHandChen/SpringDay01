package com.wzh.domain;

public class Ordersdetail {
    private int id;
    private Orders orders;
    private Items items;
    private int itemsNum;
    private double totalAmount;
    public Ordersdetail() {

    }

    public Ordersdetail(int id, Orders orders, Items items, int itemsNum) {
        this.id = id;
        this.orders = orders;
        this.items = items;
        this.itemsNum = itemsNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(int itemsNum) {
        this.itemsNum = itemsNum;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Ordersdetail{" +
                "id=" + id +
                ", orders=" + orders +
                ", items=" + items +
                ", itemsNum=" + itemsNum +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

package com.wpb.entity;

public class Orderdetail {
    private int id;
    private int ordersId;
    private int itemsId;
    private int itemsNum;
    private Items itmems;

    public Items getItmems() {
        return itmems;
    }

    public void setItmems(Items itmems) {
        this.itmems = itmems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getItemsId() {
        return itemsId;
    }

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }

    public int getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(int itemsNum) {
        this.itemsNum = itemsNum;
    }
}

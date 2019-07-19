package com.lzn.spring.entity;

public class OrderDetailEntity {
    private Integer id;
    private Integer ordersId;
    private Integer ItemsId;
    private Integer ItemsNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return ItemsId;
    }

    public void setItemsId(Integer itemsId) {
        ItemsId = itemsId;
    }

    public Integer getItemsNum() {
        return ItemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        ItemsNum = itemsNum;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", ItemsId=" + ItemsId +
                ", ItemsNum=" + ItemsNum +
                '}';
    }
}

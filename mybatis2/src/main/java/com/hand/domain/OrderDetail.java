package com.hand.domain;

public class OrderDetail {
    private  Integer id;
    private  Integer orderId;
    private  Integer itemsId;
    private  Integer itemsNum;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }
}

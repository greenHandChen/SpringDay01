package com.ll.mybatis.po;

public class Ordersdetail {

    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;

    //商品信息
    private Items items;

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

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

    public Integer getItemsNum() {
        return itemsId;
    }

    public void setItemsNum(Integer itemsId) {
        itemsId = itemsId;
    }
}

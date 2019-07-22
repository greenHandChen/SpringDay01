package com.ceh.java.examine.domain;

/**
 * Created by enHui.Chen on 2019/7/10.
 */
public class OrderDetail {
    private Integer id;// 主键

    private Integer ordersId;// 订单ID

    private Integer itemsId;//  商品ID

    private Integer itemsNum;// 商品排列顺序

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
package com.hand.pojo;

/**
 * ClassName:OrderDetail
 * Author:Hejunfeng
 * Date:2019/7/19 15:49
 */
public class OrderDetail {
    private Integer id;
    private Integer ordersId;
    private Integer items_id;
    private Integer items_num;

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

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", items_id=" + items_id +
                ", items_num=" + items_num +
                '}';
    }
}
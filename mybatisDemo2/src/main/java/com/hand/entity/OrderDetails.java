package com.hand.entity;

/**
 * ClassName:OrderDetails
 * Author:ZhangChunjia
 * Date:2019/7/19 9:46
 */
public class OrderDetails {
    private Integer detail_id;
    private Integer order_id;
    private Integer item_num;
    private Integer item_id;

    public Integer getItem_num() {
        return item_num;
    }

    public void setItem_num(Integer item_num) {
        this.item_num = item_num;
    }



    public Integer getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(Integer detail_id) {
        this.detail_id = detail_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "detail_id=" + detail_id +
                ", order_id=" + order_id +
                ", item_num=" + item_num +
                ", item_id=" + item_id +
                '}';
    }
}

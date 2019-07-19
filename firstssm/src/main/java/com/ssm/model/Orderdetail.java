package com.ssm.model;

import java.sql.Date;

/**
 * Created by minxi.jaing on 2019/7/19
 * @Decription:订单明细表的POJO类
 * */
public class Orderdetail {
    /*id	int(11)	NO	PRI		auto_increment
    orders_id	int(11)	NO	MUL
    items_id	int(11)	NO	MUL
    items_num	int(11)	YES*/
    private int id;
    private int orders_id;
    private int items_id;
    private int items_num;

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

    public int getItems_num() {
        return items_num;
    }

    public void setItems_num(int items_num) {
        this.items_num = items_num;
    }
}

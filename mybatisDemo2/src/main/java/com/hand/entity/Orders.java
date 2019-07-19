package com.hand.entity;

import java.util.Date;

/**
 * ClassName:Orders
 * Author:ZhangChunjia
 * Date:2019/7/19 9:42
 */
public class Orders {
    private Integer order_id;
    private Integer user_id;
    private Date createtime;
    private String note;
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", number=" + number +
                '}';
    }
}

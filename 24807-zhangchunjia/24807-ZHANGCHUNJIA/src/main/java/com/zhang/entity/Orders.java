package com.zhang.entity;

import java.util.Date;

/**
 * ClassName:Orders
 * Author:ZhangChunjia
 * Date:2019/7/20 15:22
 */
public class Orders {
    private Integer order_id;
    private Integer user_id;
    private String unmber;
    private Date createtime;
    private String note;

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

    public String getUnmber() {
        return unmber;
    }

    public void setUnmber(String unmber) {
        this.unmber = unmber;
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
}

package com.sunt.po;

import java.util.Date;
import java.util.List;


public class Orders {
    private int id;
    private int userId;
    private String number;
    private Date createTime;
    private String note;

    private List<OrderDetail> orderDetaillist;

    public List<OrderDetail> getOrderDetaillist() {
        return orderDetaillist;
    }

    public void setOrderDetaillist(List<OrderDetail> orderDetaillist) {
        this.orderDetaillist = orderDetaillist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                '}';
    }
}

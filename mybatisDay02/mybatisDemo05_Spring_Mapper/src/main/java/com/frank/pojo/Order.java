package com.frank.pojo;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private Integer userId;
    private Integer number;
    private Date createtime;
    private String note;

    //订单和user对象是一对一关系
    private User user;

    public User getUser() {
        return user;
    }

    //订单和订单详情是一对多的关系
    private List<Orderdetail> orderdetail;

    public Order() {
    }

    public Order(Integer id, Integer userId, Integer number, Date createtime, String note, User user) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
        this.user = user;
    }


    public List<Orderdetail> getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(List<Orderdetail> orderdetail) {
        this.orderdetail = orderdetail;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", number=" + number +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", user=" + user +
                ", orderdetail=" + orderdetail +
                '}';
    }
}

package com.hand.entity;

import java.util.Date;

public class OrdersUser {
    private Integer id;
    private Integer user_id;
    private int number;
    private Date createtime;
    private String note;
    private User user;

    public OrdersUser() {
    }

    public OrdersUser(Integer id, Integer user_id, int number, Date createtime, String note, User user) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrdersUser{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number=" + number +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", user=" + user +
                '}';
    }
}

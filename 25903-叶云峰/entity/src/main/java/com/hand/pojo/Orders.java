package com.hand.pojo;

import java.sql.Date;

public class Orders {
    private  Integer id;
    private  Integer userId;
    private  String  number;
    private Date createtime;
    private  String note;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public Orders(Integer id, Integer userId, String number, Date createtime, String note) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
    }

    public Orders() {
    }
}

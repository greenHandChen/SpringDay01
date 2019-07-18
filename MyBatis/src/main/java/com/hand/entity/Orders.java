package com.hand.entity;


import java.util.Date;

public class Orders {
    private Integer id;
    private Integer user_id;
    private int number;
    private Date createtime;
    private String note;

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public Orders() {
    }

    public Orders(Integer user_id, int number, Date createtime, String note) {
        this.user_id = user_id;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
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
                ", user_id=" + user_id +
                ", number=" + number +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}

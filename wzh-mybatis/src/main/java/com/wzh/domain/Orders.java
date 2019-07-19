package com.wzh.domain;

import java.util.Date;
import java.util.List;

public class Orders {
    private int id;
    private int number;
    private Date createtime;
    private String note;
    private User user;
    List<Ordersdetail> detailList;
    public Orders() {
    }

    public Orders(int id, int number, Date createtime, String note, User user, List<Ordersdetail> detailList) {
        this.id = id;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
        this.user = user;
        this.detailList = detailList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Ordersdetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Ordersdetail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number=" + number +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", user=" + user +
                ", detailList=" + detailList +
                '}';
    }
}

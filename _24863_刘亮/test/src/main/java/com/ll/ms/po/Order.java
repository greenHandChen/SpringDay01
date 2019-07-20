package com.ll.ms.po;

import java.util.Date;

public class Order {

    private int id;
    private int user_id;
    private String number;
    private Date datetime;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order(int id, int user_id, String number, Date datetime, String note) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
        this.datetime = datetime;
        this.note = note;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", datetime=" + datetime +
                ", note='" + note + '\'' +
                '}';
    }
}

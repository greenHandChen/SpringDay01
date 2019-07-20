package com.ssm.model;

import java.sql.Date;

/**
 * Created by minxi.jiang on 2019/7/20
 * @decription：订单表
 * */
public class Orders {
    private int id;
    private int user_ids;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user_id=" + user_ids +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }

    private String number;
    private Date createtime;
    private String note;

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_ids() {
        return user_ids;
    }

    public void setUser_id(Integer user_id) {
        this.user_ids = user_id;
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
}

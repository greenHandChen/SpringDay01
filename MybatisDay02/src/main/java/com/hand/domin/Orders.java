package com.hand.domin;

import java.util.Date;

public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;

    public void setId(Integer id) {
        this.id = id;
    }



    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
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

    public Date getCreatetime() {
        return createtime;
    }

    public String getNote() {
        return note;
    }

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
}

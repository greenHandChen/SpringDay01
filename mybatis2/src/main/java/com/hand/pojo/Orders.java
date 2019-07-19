package com.hand.pojo;

import java.util.Date;

/**
 * ClassName:Orders
 * Author:Hejunfeng
 * Date:2019/7/19 9:43
 */
public class Orders {
    private Integer id;
    private Integer userId;
    private Integer mumber;
    private Date createtime;
    private String note;

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

    public Integer getMumber() {
        return mumber;
    }

    public void setMumber(Integer mumber) {
        this.mumber = mumber;
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
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", mumber=" + mumber +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}
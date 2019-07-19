package com.yonye.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:Yonye
 * @Date:2019/7/19 14:09
 * @Version:1.0
 * @deseription:
 **/
public class Orders implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer number;
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
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number=" + number +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}
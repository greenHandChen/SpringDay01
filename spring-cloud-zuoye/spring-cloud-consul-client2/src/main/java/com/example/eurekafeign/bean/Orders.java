package com.example.eurekafeign.bean;

import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;


public class Orders  implements Serializable {
    private Integer id;
    private Integer UserId;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", UserId=" + UserId +
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
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
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

    private String number;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private String note;
}

package com.hand.sysmanager.entity;

import java.util.Date;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/18 15:11
 */
public class Orders {
    private Long id;
    private Long userId;
    private String number;
    private Date    creatTime;
    private String note;


    public Long getId() {
        return id;
    }

    public void setId(Long orderId) {
        this.id = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

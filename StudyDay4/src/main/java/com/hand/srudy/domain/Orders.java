package com.hand.srudy.domain;

import java.util.Date;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 20:06
 * @Version 1.0
 */

public class Orders {
    private Long orderId;
    private Long userId;
    private String number;
    private Date    creattime;
    private String note;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
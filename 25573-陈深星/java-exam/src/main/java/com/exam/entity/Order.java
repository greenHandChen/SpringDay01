package com.exam.entity;

import java.util.Date;

public class Order {

    // 自增主键（唯一识别）
    private Integer id;

    // 用户编号
    // 订单编号
    // 创建时间
    // 备注
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;

    // Getter & Setter
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

    // getAllInfo
    public void getAllInfo() {

        System.out.println("id: " + this.id);

        System.out.println("userId: " + this.userId);

        System.out.println("createtime: " + this.createtime);

        System.out.println("note: " + this.note);

    }


}

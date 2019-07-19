package com.domain;

import java.util.Date;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 8:56 2019/7/19
 * @Modified By:
 */
public class Orders {
    private Integer id;
    private Integer user_id;
    private String number;
    private String note;
    private Date createtime;

    private List<OrderDetail> orderDetailList;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + user_id +
                ", number='" + number + '\'' +
                ", note='" + note + '\'' +
                ", createtime=" + createtime +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}

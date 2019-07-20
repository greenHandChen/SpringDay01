package com.ljx.ssm.po;

import java.util.Date;
import java.util.List;

/**
 *功能描述   扩展类
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:40
 */
public class OrdersExt extends Orders{

    private String username;// 用户姓名
    private String sex;// 性别

    private Date createtimeStart;
    private Date createtimeEnd;
    private Double priceStart;
    private Double priceEnd;

    public Date getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(Date createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public Date getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(Date createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
    }

    public Double getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Double priceStart) {
        this.priceStart = priceStart;
    }

    public Double getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Double priceEnd) {
        this.priceEnd = priceEnd;
    }

    //用于嵌套
    private User user;

    //订单明细信息
    private List<Orderdetail> detailList;

    public List<Orderdetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Orderdetail> detailList) {
        this.detailList = detailList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                ", detailList=" + detailList +
                '}';
    }
}

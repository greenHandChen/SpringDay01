package com.masirhh.mybatis1.beans;

import java.util.List;

public class orderExtDdd extends ordersBean {
    private String username;
    private String address;
    private userBean userBean;
    private List<ordersBean> orderdetail;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.masirhh.mybatis1.beans.userBean getUserBean() {
        return userBean;
    }

    public void setUserBean(com.masirhh.mybatis1.beans.userBean userBean) {
        this.userBean = userBean;
    }

    public List<ordersBean> getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(List<ordersBean> orderdetail) {
        this.orderdetail = orderdetail;
    }
}

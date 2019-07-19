package com.masirhh.mybatis2.beans;

public class orderExtByMap extends ordersBean {
    private String username;
    private String address;
    private userBean userBean;

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

    public com.masirhh.mybatis2.beans.userBean getUserBean() {
        return userBean;
    }

    public void setUserBean(com.masirhh.mybatis2.beans.userBean userBean) {
        this.userBean = userBean;
    }
}

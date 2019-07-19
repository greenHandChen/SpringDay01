package com.yhk.Pojo;

import java.util.List;

public class OrdersExt extends Orders {

    /**
     * 添加order中没有的属性
     * user.username
     * user.sex
     * User user
     * detailList
     */
    private String username;
    private  String address;
    private User user; //一对一

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


//    private List<Orderdetail> detaileList; //一对多

//    public List<Orderdetail> getDetaileList() {
//        return detaileList;
//    }
//
//    public void setDetaileList(List<Orderdetail> detaileList) {
//        this.detaileList = detaileList;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = user.getUsername();
    }


    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }
}

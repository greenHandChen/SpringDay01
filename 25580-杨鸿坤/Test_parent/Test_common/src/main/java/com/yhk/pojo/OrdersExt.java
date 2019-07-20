package com.yhk.pojo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdersExt extends Orders {

    /**
     * 添加order中没有的属性
     * user.username
     * user.sex
     * User user 拓展用户信息
     * item.name
     * detailList
     */
    private String username;
    private  String address;
    private User user; //一对一

    private String name;//商品名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    private List<Orderdetail> detaileList; //一对多

    public List<Orderdetail> getDetaileList() {
        return detaileList;
    }

    public void setDetaileList(List<Orderdetail> detaileList) {
        this.detaileList = detaileList;
    }

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
        this.username = username;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", detaileList=" + detaileList +
                '}';
    }
}

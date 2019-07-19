package com.hand.pojo;

/**
 * ClassName:OrdersExt1
 * Author:Hejunfeng
 * Date:2019/7/19 11:06
 */
public class OrdersExt1 extends Orders {
     private String username;
     private String address;
     private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + super.getId() +
                ", userId=" + super.getUserId() +
                ", mumber=" + super.getMumber() +
                ", createtime=" + super.getCreatetime() +
                ", note='" + super.getNote() + '\'' +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "OrdersExt1{" +
//                "user=" + user +
//                '}';
//    }
}
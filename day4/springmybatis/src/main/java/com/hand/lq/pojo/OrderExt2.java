package com.hand.lq.pojo;

public class OrderExt2 extends Orders{
    String username;
    String address;
    User user;

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
        return "OrderExt2{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                ", id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                '}';
    }
}

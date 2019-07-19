package com.hand.lq.pojo;

public class OrderExt extends Orders{
    String username;
    String address;

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

    @Override
    public String toString() {
        return "OrderExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                '}';
    }
}

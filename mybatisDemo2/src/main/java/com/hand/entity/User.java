package com.hand.entity;

import java.io.Serializable;

/**
 * ClassName:User
 * Author:ZhangChunjia
 * Date:2019/7/19 9:40
 */
//使用二级缓存需要把实体类实现序列化
public class User implements Serializable {
    private Integer user_id;
    private String username;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

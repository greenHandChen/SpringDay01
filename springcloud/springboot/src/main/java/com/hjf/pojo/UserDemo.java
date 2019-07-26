package com.hjf.pojo;

/**
 * ClassName:UserDemo
 * Author:Hejunfeng
 * Date:2019/7/22 16:43
 */
public class UserDemo {
    private  Integer userId;
    private  String userName;
    private  String userSex;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
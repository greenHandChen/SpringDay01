package com.hand.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    private int userID;
    private String username;
    private String password;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        String id = "用户id" + getUserID();
        String name = "用户名" + getUsername();
        String password = "用户密码" + getPassword();

        return id + "\n" + name + "\n" + password;
    }


}

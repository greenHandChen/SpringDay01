package com.hand.ms.po;

import java.util.Date;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 9:57
 * @Version 1.0
 */

public class User {
    private int id;
    private String username;
    private String sex;
    private Date Birthday;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", Birthday=" + Birthday +
                ", address='" + address + '\'' +
                '}';
    }
}

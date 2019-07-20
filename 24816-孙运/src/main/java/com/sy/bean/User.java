package com.sy.bean;

import java.io.Serializable;
import java.util.Date;

public class User  implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }
}

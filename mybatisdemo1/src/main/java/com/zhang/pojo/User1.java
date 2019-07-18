package com.zhang.pojo;

import com.zhang.util.DateUtils;

import java.util.Date;

/**
 * ClassName:User1
 * Author:ZhangChunjia
 * Date:2019/7/18 11:15
 */
public class User1 {
    private String id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "id:"+id+" name:"+username+" birthday:"+new DateUtils().dateFromat(birthday) +" sex:"+sex+" address:"+address;
    }
}

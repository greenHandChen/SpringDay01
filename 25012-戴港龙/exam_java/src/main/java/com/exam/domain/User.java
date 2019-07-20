package com.exam.domain;

import java.util.Date;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 11:36 2019/7/18
 * @Modified By:
 */
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    private Integer manage_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getManage_id() {
        return manage_id;
    }

    public void setManage_id(Integer manage_id) {
        this.manage_id = manage_id;
    }

}

package com.hand.Entity;

import java.util.Date;

public class User {

    private Integer id;

    private String username;

    private Date birthday;

    private Integer sex;

    private String address;

    public User() {

        super();

    }

    // 临时：测试update方法使用
    public User(Integer id, String username) {

        this.id = id;

        this.username = username;

    }

    public User(String username, Integer sex, String address) {

        this.username = username;

        this.sex = sex;

        this.address = address;

    }

    // Getter & Setter
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

    // getAllInfo
    public void getAllInfo() {

        System.out.println("id:" + this.id);

        System.out.println("username:" + this.username);

        System.out.println("birthday:" + this.birthday);

        System.out.println("sex:" + this.sex);

        System.out.println("address:" + this.address);

    }

}

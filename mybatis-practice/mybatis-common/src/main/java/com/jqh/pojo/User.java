package com.jqh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 09:19
 * @Description: User
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private Integer sex;
    private String address;

    public User() {
    }

    public User(String username, Date birthday, Integer sex, String address) {
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }
}

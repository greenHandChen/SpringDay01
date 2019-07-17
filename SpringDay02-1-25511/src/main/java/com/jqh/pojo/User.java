package com.jqh.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 09:28
 * @Description: User
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}

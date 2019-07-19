package com.yonye.mybatis.vo;

import com.yonye.mybatis.pojo.User;

import java.io.Serializable;

/**
 * @Author:Yonye
 * @Date:2019/7/18 15:07
 * @Version:1.0
 * @deseription:
 **/
public class UserQueryVo implements Serializable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

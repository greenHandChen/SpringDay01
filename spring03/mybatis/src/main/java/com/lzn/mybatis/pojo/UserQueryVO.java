package com.lzn.mybatis.pojo;

import com.lzn.mybatis.entity.UserEntity;

public class UserQueryVO {
    private UserEntity user;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserQueryVO{" +
                "user=" + user +
                '}';
    }
}

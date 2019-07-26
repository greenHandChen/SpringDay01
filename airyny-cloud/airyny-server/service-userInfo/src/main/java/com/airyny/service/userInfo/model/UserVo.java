package com.airyny.service.userInfo.model;

/**
 * @Author:Yonye
 * @Date:2019/7/26 12:47
 * @Version:1.0
 * @deseription:
 **/
public class UserVo {
    private User user;
    private UserInfo userInfo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}

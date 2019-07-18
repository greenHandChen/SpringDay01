package com.hand.wqw.vo;

import com.hand.wqw.domain.User;

public class UserQueryVo {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserQueryVo{" +
                "user=" + user +
                '}';
    }
}

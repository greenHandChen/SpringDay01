package com.hand.domain;

public class UserQueryVO {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserQueryVO{" +
                "user=" + user +
                '}';
    }
}

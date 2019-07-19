package com.domain;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:05 2019/7/19
 * @Modified By:
 */
public class OrdersExt extends Orders {
    //存放用户信息
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrdersExt{" +super.toString()+
                ",user=" + user +
                '}';
    }
}

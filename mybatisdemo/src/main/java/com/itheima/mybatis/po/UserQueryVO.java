package com.itheima.mybatis.po;

import java.util.List;

public class UserQueryVO {

    //用户信息
    private User user;

    //商品id集合
    private List<Integer> idList;

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //商品信息

    //订单信息
}

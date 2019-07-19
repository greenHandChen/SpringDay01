package com.ll.mybatis.po;

import java.util.List;

public class UserQueryVO {

    //用户信息
    private User user;

    //id集合
    private List<Integer> idlist;

    public List<Integer> getIdlist() {
        return idlist;
    }

    public void setIdlist(List<Integer> idlist) {
        this.idlist = idlist;
    }
//商品信息

    //订单信息

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }





}

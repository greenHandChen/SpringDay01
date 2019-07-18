package com.hand.mybatis.po;

import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 19:10
 * @Version 1.0
 */

public class UserQueryVO {
    //用户信息
    private  User user;

    private List<Integer> idList;

    //商品ID集合
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
}

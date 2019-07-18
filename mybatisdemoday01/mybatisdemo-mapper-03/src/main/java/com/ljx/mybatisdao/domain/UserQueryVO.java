package com.ljx.mybatisdao.domain;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/18
 * @Time 14:44
 */
public class UserQueryVO {

    //用户信息
    private User user;

    //商品ID集合
    private List<Integer> idList;

    //商品信息

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

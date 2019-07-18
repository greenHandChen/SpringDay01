package com.po;

import com.domain.User;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 17:42 2019/7/18
 * @Modified By:
 */
public class UserQueryVO {

    //用户信息
    private User user;
    //用户ID集合
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
}

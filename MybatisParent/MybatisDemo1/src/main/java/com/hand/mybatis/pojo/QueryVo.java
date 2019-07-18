package com.hand.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable {
    private static final long serialVersionUID = 1L;


    private User user;

    private Integer[] ids;

    List<Integer> listids;

    public Integer[] getIds() {
        return ids;
    }

    public List<Integer> getListids() {
        return listids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }


    public void setListids(List<Integer> listids) {
        this.listids = listids;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

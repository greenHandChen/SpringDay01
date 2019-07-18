package org.hgh.vo;

import org.hgh.pojo.User;

import java.util.Date;

public class UserVO extends User {
    private Integer id;

    public UserVO(String username, Date birthday, Integer sex, String address){
        super(username,birthday,sex,address);
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}

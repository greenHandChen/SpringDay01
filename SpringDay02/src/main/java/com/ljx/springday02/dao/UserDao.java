package com.ljx.springday02.dao;

import com.ljx.springday02.entry.User;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 15:21
 */
public interface UserDao {
    void update(User user);

    User getUser(User user);
    List<User> findUser();

}

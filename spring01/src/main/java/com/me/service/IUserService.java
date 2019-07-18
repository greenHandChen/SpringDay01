package com.me.service;

import com.me.entity.User;

import java.util.List;

public interface IUserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int removeUser(Integer id);

    /**
     * 获取所有用户
     * @return
     */
    public List<User> getAllUser();

    /**
     * 通过用户编号查询用户
     * @param id
     * @return
     */
    public User getUserById(Integer id);
}

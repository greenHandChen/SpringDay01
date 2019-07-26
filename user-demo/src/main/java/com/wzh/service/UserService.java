package com.wzh.service;


import com.wzh.pojo.User;

public interface UserService {
    public User findUserById(int id);

    public int updateUser(User user);

    public int insertUser(User user);

    public int deleteUser(int id);
}

package com.example.springcloudconsulclient.mapper;

import com.example.springcloudconsulclient.bean.User;

import java.util.List;
public interface UserMapper {
    List<User> findUserById(Integer id);

    List<User> findUserByUser(User user);

    Integer deleteUserInfo(User user);

    Integer insertUserInfo(User user);

    Integer updateUserInfo(User user);
}

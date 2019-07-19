package com.ll.ms.mapper;

import com.ll.ms.po.User;

import java.util.List;

public interface UserMapper {

    //根据用户ID查询用户信息
    public User findUserById(int id);

//    public List<User> findAllUsers();


}

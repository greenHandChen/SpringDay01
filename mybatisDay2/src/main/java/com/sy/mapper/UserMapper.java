package com.sy.mapper;

import com.sy.bean.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int insertInfo(User user);


    User findUserMap(Integer id);

}

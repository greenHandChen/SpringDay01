package com.masirhh.mybatis.mapper;

import com.masirhh.mybatis.beans.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    List<User> findUserByMap(Map<String,String> map);
}

package com.hph.dao;

import com.hph.entity.User;
import com.hph.entity.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);

    List<User> findUserByUser(UserQueryVo userQueryVo);

    List<User> findUserByMap(Map<String, String> map);

    User testResultMap(Integer id);

    List<User> testIfAndWhereLable(User user);
}

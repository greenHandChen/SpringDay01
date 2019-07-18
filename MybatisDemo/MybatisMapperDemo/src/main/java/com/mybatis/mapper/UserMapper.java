package com.mybatis.mapper;

import com.mybatis.pojo.User;
import com.mybatis.pojo.UserQueryPojo;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findUserById(int id);

    List<User> findUserByName(String name);

    int addUser(User user);

    User findUserByPojo(UserQueryPojo userQueryPojo);

    List<User> findUserByMap(Map<String ,String > map);

    User findUserReturnMap(int id);

    List<User> findUserByWhereAndIf(User user);
}

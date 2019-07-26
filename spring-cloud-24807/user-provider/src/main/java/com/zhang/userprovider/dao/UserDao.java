package com.zhang.userprovider.dao;

import com.zhang.userprovider.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> getAllUsers();

    Integer addUser(User user);

    Integer deleteUser(Integer id);

    Integer updateUser(User user);
}

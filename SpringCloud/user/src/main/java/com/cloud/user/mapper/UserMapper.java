package com.cloud.user.mapper;

import com.cloud.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User findById(Integer id);
    List<User> findAll();
    Integer addUser(User user);
    Integer updateUser(User user);
    Integer deleteUser(Integer id);
}

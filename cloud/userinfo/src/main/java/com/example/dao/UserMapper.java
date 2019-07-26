package com.example.dao;

import com.example.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    User getById(Integer uid);
    Integer addUser(User user);
    Integer deleteUser(Integer id);
    Integer updateUser(User user);
}

package com.hand.user.service;

import com.hand.user.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    int save(User user);
    int deleteById(Integer id);
    int updateById(User user);
}

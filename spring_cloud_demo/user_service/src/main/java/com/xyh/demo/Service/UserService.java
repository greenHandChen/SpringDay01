package com.xyh.demo.Service;

import com.xyh.demo.Entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    User create(User user);

    User update(User user);

    void delete(Integer id);
}

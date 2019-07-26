package com.masirhh.userprovider.service;

import com.masirhh.userprovider.beans.User;
import com.masirhh.userprovider.beans.UserExt;

import java.util.List;

public interface UserService {

    User findUserById(Integer id);
    List<User> findAll();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);

    UserExt findUserExt(Integer id);
}

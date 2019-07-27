package com.hand.handmanageruser.user.service;

import com.hand.handmanageruser.user.entity.User;

import java.util.List;

public interface IUserService {


    User findUserById(Long userId);

    Long delUserById(Long userId);

    List<User> findAllUser();

    Long addUser(User user);


}

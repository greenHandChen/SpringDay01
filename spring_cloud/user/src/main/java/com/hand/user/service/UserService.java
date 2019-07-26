package com.hand.user.service;

import com.hand.user.entity.User;

import java.util.List;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/
public interface UserService {

    List<User> findAll();

    User findUserById(int id);
}

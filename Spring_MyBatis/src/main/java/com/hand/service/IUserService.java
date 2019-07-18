package com.hand.service;

import com.hand.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> getAllUser();

    public int addUser(User user);

    public int removeUser(User user);

    public int modifyUser(User user);
}

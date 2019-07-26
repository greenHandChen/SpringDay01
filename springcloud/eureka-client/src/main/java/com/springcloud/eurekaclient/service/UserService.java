package com.springcloud.eurekaclient.service;

import com.springcloud.eurekaclient.bean.User;

public interface UserService {

    User getUserById(Integer id);

    void deleteUserById(Integer id);

    void updateUser(User user);

    void addUser(User user);

}

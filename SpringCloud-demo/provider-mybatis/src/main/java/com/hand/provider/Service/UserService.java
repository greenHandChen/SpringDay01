package com.hand.provider.Service;

import com.hand.provider.pojo.User;

public interface UserService {

    User findUserById(Integer id);


    void  addUser(User user);
}

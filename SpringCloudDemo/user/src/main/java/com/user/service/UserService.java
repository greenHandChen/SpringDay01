package com.user.service;

import com.user.domain.User;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
public interface UserService {
    User getUser(Integer id);

    Integer updateUser(User user);
    //
    Integer deleteUserById(Integer id);

    Integer insertUser(User user);

}

package com.hand.mapper;

import com.hand.bean.User;
import com.hand.bean.UserQueryVO;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int insertInfo(User user);

    List<User> findUserByUser(UserQueryVO userQueryVO);

    User findUserMap (Integer id);

}

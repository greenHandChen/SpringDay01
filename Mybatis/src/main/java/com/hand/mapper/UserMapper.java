package com.hand.mapper;

import com.hand.POJO.UserQueryVO;
import com.hand.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(int id);
    int addUser(User user);
    int deleteUserById(int id);
    int updateUserAddress(User user);
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
}

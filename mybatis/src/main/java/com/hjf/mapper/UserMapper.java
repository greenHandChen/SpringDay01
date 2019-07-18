package com.hjf.mapper;

import com.hjf.pojo.User;
import com.hjf.pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    int countUser();
    User findUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
}

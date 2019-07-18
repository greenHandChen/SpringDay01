package com.hand.dao;

import com.hand.domain.User;
import com.hand.pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    User finUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    Integer countUser();
    User findUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
    User testIfAndWhereLabel(User user);
}

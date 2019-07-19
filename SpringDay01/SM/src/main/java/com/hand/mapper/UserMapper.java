package com.hand.mapper;

import com.hand.common.UserQueryVO;
import com.hand.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findById(Integer id);
    List<User> findByName(String name);
    User findByUser(UserQueryVO uservo);
    User findUserByMap(Map<String, String> map);
    int countUser();
    User findUserNameANDaddress(int id);
    User testResultMap(Integer id);
    User testIfAndWhereLable(User user);
    int addUser(User user);
}

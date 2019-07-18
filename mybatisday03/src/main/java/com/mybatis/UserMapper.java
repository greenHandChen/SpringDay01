package com.mybatis;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    int countUser();
    User findUsernameAndAddressById(Integer id);
    User testResultMap(Integer id);
    User testIfAndWhereLabel(User user);
}

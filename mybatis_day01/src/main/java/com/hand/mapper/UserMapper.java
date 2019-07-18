package com.hand.mapper;

import com.hand.pojo.User;
import com.hand.pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    User finUserNameAndAddressById(Integer id);
    User testResultMap(Integer id);
    List<User> testIfAndWhereLabel(User user);
}

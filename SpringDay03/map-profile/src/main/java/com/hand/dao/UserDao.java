package com.hand.dao;

import com.hand.pojo.User;
import com.hand.vo.UserVO;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> findUserByVO(UserVO userVO);

    List<User> findUserByMap(Map<String, String> map);

    int countUser();

    List<User> findByConditions(User user);
}

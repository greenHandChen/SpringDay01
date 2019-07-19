package com.hand.srudy.dao;

import com.hand.srudy.domain.User;
import com.hand.srudy.domain.UserQueryVO;

import java.util.List;
import java.util.Map;


public interface UserDao {


    User findUserById(Long userId);

    List<User> findUserByUsername(String username);


    Long addUser(User user);

    Long addUserGetId(User user);

    Long addUserGetUUID(User user);

    List<User> findUserByUser(UserQueryVO userQueryVO);

    List<User> findUserByMap(Map<String,String> map);

    int countUser();

    User findusernameAndAddressById(Long id);

    User findUserByIdMap(Long id);

    List<User> testIfAndWhereLabel(User user);
}
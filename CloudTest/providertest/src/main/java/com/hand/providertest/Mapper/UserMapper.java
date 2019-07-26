package com.hand.providertest.Mapper;

import com.hand.providertest.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper{
    List<User> findUserAll();
    User findUserById(Integer id);
    Integer findUserId(Integer id);
    Integer addUser(User user);
    Integer updateUserById(User user);
    Integer deleteUserById(Integer id);
}

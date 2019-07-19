package com.hand.dao;

import com.hand.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUserById(int id);
    int addUser(User user);
}

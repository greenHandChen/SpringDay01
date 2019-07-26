package com.hand.user.dao;

import com.hand.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> findAll();
    User findById(Integer id);
    int save(User user);
    int deleteById(Integer id);
    int updateById(User user);
}

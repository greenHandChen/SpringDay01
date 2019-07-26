package com.hand.user.mapper;

import com.hand.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    User findUserById(int id);
}

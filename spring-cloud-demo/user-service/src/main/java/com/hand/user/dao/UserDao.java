package com.hand.user.dao;

import com.hand.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User selectById(User user);
}

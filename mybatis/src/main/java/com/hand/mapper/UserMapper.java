package com.hand.mapper;

import com.hand.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(@Param("map") Map<String,Object> map);

    List<User> getUserByUsername(@Param("map") Map<String,Object> map);

    List<User> getUserByUser(@Param("map") Map<String,Object> map);

    void addUser(@Param("map") Map<String,Object> map);
}

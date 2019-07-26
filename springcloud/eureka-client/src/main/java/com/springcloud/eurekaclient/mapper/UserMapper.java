package com.springcloud.eurekaclient.mapper;

import com.springcloud.eurekaclient.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    User getUserById(@Param("map") Map<String,Object> map);

    void deleteUserById(@Param("map") Map<String,Object> map);

    void updateUser(@Param("map") Map<String,Object> map);

    void addUser(@Param("map") Map<String,Object> map);

}

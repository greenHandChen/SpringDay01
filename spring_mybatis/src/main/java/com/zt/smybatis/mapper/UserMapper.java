package com.zt.smybatis.mapper;


import com.zt.smybatis.domain.User;

public interface UserMapper {

    User findUserById(Integer id);

}
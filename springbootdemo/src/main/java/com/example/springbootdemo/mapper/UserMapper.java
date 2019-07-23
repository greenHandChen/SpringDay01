package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUserInfo();
}

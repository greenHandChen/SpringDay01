package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.User;

import java.util.List;

public interface UserService {
    List<User> queryUserInfo();
}

package com.hand.smybatis.service;

import com.hand.smybatis.pojo.User;

import java.util.List;

public interface UserMapperService {


    User findUserById(Integer id);
    List<User> selectMoreByMore();
}

package com.yhk.microserviceuser.service;

import com.yhk.microserviceuser.pojo.User;

import java.util.List;

//import java.util.List;

public interface UserService {
//    查询所有用户
    List<User> findAllUser();
//    根据ID查询用户
    User findUser(int id);
//添加用户
    void insertUser(User user);
//更新用户
    int upUser(User user);
    //    删除用户
    int delUser(User user);
}

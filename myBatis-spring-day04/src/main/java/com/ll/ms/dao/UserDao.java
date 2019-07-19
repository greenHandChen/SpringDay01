package com.ll.ms.dao;

import com.ll.ms.po.User;

import java.util.List;

public interface UserDao {

    User findUserById(int id) throws Exception;

//    List<User> findAllUsers() throws Exception;

}

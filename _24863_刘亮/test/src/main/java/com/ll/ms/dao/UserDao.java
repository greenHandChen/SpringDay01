package com.ll.ms.dao;

import com.ll.ms.po.User;

public interface UserDao {

    User findUserByIdDao(int id) throws Exception;

//    List<User> findAllUsers() throws Exception;

}

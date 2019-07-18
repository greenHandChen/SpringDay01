package com.lhb.dao;

import com.lhb.domain.User;
import com.sun.corba.se.spi.protocol.RequestDispatcherRegistry;

import java.util.List;

/**
 * Created By LHB on 2019/7/18;
 */
public interface UserMapper {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 根据用户名获取用户列表
     * @param username
     * @return
     */
    List<User> findUserByUsername(String username);

    int addUser(User user);





}

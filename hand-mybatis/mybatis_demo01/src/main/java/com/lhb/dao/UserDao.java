package com.lhb.dao;

import com.lhb.domain.User;

import java.util.List;

/**
 * Created By LHB on 2019/7/18;
 */
public interface UserDao {
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


    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 添加用户，获取id
     * @param user
     * @return
     */

    int addUserGetId(User user);

}

package com.dao;

import com.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 15:40 2019/7/18
 * @Modified By:
 */
public interface IUserDao {
    //根据用户id查询用户信息
    public User findUserById(Integer id) throws IOException;

    //根据用户名称模糊查询用户列表
    public List<User> findUsersByName(String name);

    //添加用户
    public boolean insertUser(User user);
}

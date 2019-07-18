package com.hand.dao;

import com.hand.domain.User;

import java.util.List;

public interface UserDao {

    /**
      * @Author: MikeLv
      * @Description: 根据id查询用户
      * @Date: 2019/7/18 12:00
      */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 根据用户名获取用户列表
      * @Date: 2019/7/18 12:00
      */

    List<User> findUserByUsername(String username);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/18 12:01
      */

    int addUser(User user);

}

package com.hand.mapper;

import com.hand.domain.User;

import java.util.List;

public interface UserMapper {
    /**
      * @Author: MikeLv
      * @Description: 根据id查询用户
      * @Date: 2019/7/18 14:36
      */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 根据用户名获取用户列表
      * @Date: 2019/7/18 14:37
      */
    List<User> findUserByUsername(String username);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/18 14:38
      */
    int addUser(User user);
}

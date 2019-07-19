package com.hand.mapper;

import com.hand.domain.User;

public interface UserMapper {

    /**
     * @Author: MikeLv
     * @Description: 根据ID查询用户信息
     * @Date: 2019/7/19 14:12
     */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/19 16:13
      */
    Integer addUser(User user);
}

package com.ceh.mybatis.dao;

import com.ceh.mybatis.domain.User;

import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/8.
 */
public interface UserDao {
     /**
       * @Author: enHui.Chen
       * @Description: 根据id查询用户
       * @Data 2019/7/8
       */
    User findUserById(Integer id);
    /**
     * @Author: enHui.Chen
     * @Description: 根据用户名获取用户列表
     * @Data 2019/7/8
     */
    List<User> findUserByUsername(String username);
    /**
     * @Author: enHui.Chen
     * @Description: 添加用户
     * @Data 2019/7/8
     */
    int addUser(User user);
}

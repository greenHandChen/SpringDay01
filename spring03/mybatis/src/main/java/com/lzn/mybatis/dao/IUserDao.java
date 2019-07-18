package com.lzn.mybatis.dao;

import com.lzn.mybatis.entity.UserEntity;

import java.util.List;

public interface IUserDao {

    /**
     * @Description 根据 id查询用户
     * @Param  * @param null
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 17:05
     */
    UserEntity findUserById(Integer id);

    /**
     * @Description 根据用户名获取用户列表
     * @Param
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 17:05
     */
    List<UserEntity> findUserByUsername(String username);

    /**
     * @Description 添加
     * @Param
     * @Return 受影响行数
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 17:05
     */
    int addUser(UserEntity user);
}

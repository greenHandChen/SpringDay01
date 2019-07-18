package com.yonye.mybatis.dao;

import com.yonye.mybatis.pojo.User;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/18
 * @Version:1.0
 * @deseription:
 **/
public interface UserDao {

    /**
     * @Author: Yonye
     * @Date: 2019/7/18
     * @Description: 根据用户Id查询用户信息
     * @Parms:[id]
     * @Return: com.yonye.mybatis.pojo.User
     */
    User findUserById(Integer id);

    /**
     * @Author: Yonye
     * @Date: 2019/7/18
     * @Description: 根据用户名获取用户列表
     * @Parms:[username]
     * @Return: java.util.List<com.yonye.mybatis.pojo.User>
     */
    List<User>  findUserByUserName(String username);


    /**
     * @Author: Yonye
     * @Date: 2019/7/18
     * @Description: 添加用户
     * @Parms:[user]
     * @Return: int
     */
    int addUser(User user);




}

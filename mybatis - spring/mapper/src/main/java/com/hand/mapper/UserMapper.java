package com.hand.mapper;

import com.hand.VO.UserQueryVO;
import com.hand.pojo.User;


import java.util.List;
/**
*@Description 用户表映射接口
*@Author yunfeng.ye
*@Date 2019/7/19
*@Time 19:53
*/
public interface UserMapper {
    /**
    *@Description 查看所有用户
    *@Return 用户对象集合
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:54
    */
    public List<User> showUsers();
    /**
    *@Description 查询指定id的用户信息
    *@Param 用户id
    *@Return 用户对象
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:54
    */
    public User findUserById(Integer id);
    /**
    *@Description 通过名字模糊查询用户
    *@Param 模糊查询的名字
    *@Return 用户对象集合
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:55
    */
    public List<User> findUserByName(String username);
    /**
    *@Description 插入用户
    *@Param 用户对象
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:56
    */
    public void addUser(User user);
    /**
    *@Description 插入地址为UUID的用户对象
    *@Param 用户对象
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:56
    */
    public void addUserByUUID(User user);
    /**
    *@Description 通过临时类查询用户
    *@Param 用户临时类
    *@Return 用户对象
    *@Author yunfeng.ye
    *@Date 2019/7/19
    *@Time 19:57
    */
    public User findUserByUser(UserQueryVO uv);
}

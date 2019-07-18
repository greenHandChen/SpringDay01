package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.User;
import com.itheima.mybatis.po.UserQueryVO;

import java.util.List;

public interface UserMapper {

    //1，根据用户id查询用户信息
    public User findUserById(int id) throws Exception;

    //3，添加用户
    public void insertUser(User user) throws Exception;

    //综合查询
    public List<User> findUserList(UserQueryVO vo);

    //综合查询用户总数
    public int findUserCount(UserQueryVO vo);

    //resultMap入门
    public User findUserResultMap(int id);

}

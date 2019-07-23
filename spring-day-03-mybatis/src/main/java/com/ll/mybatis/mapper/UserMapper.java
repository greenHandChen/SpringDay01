package com.ll.mybatis.mapper;

import com.ll.mybatis.po.User;
import com.ll.mybatis.po.UserQueryVO;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

    User findUserById(int id);

    void insertUser(User user);

    //综合查询
    public List<User> findUserList(UserQueryVO vo);

    public List<User> findUserByMap(HashMap<String,String> map);

    //综合查询用户总数
    public int findUserCount(UserQueryVO vo);

    //ResultMap入门
    public User findUserRstMap(int id);
}

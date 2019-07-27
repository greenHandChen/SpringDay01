package com.example.userserver.mapper;

import com.example.userserver.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {

    /**
     * 添加
     */
    int insertSelective(User record);

    /**
     * 根据Id主键查询单个用户 登录用此方法
     */
    User selectByPrimaryKey(String id);

    /**
     * 更改用户
     */
    int updateByPrimaryKeySelective(User record);


    /*
     *
     * 批量删除用户
     */
    int deleteByPrimaryKeys(int[] ids);

    /*
     *
     * 用户列表 以及 根据条件查询
     */
    List<User> selectByUser(User user);

}

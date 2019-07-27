package com.hand.sysmanager.mapper;

import com.hand.sysmanager.entity.User;import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * @Description: 根据用户ID查找用户
     * @Param: [userId]
     * @return: com.hand.sysmanager.entity.User
     * @Author: LWY
     * @Date: 2019/7/19 16:00
     */
    User findUserById(@Param("userId") Long userId);
}
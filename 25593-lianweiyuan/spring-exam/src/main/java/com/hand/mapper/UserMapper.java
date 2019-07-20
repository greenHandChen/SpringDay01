package com.hand.mapper;

import com.hand.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * @Description: 通过用户ID找用户
     * @Param: [userId]
     * @return: com.hand.entity.User
     * @Author: LWY
     * @Date: 2019/7/20 15:49
     */
    User findUserById(@Param("userId") Integer userId);
}

package com.zt.eureka_producer_user.mapper;

import com.zt.eureka_producer_user.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 14:19
 */
@Mapper
public interface UserMapper {

    // 根据用户名模糊查询用户
    List<User> selectUserByName(User user);

    // 根据id精确查找用户
    User selectUserById(User user);

    // 添加用户
    int createUser(User user);

    // 更新用户信息
    int updateUser(User user);

    // 删除用户
    int deleteUser(User user);
}

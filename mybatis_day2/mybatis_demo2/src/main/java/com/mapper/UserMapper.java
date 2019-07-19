package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:37 2019/7/18
 * @Modified By:
 */
public interface UserMapper {
    //多对多关系
    List<User> findUserAndItemsResultMap();

    User findUserById(Integer id);

    Integer updateUserById(User user);
}

package com.txz.mapper;

import com.txz.domain.User;

public interface UserMapper {

    //根据ID查询用户信息
    User findUserById(Integer id);

}

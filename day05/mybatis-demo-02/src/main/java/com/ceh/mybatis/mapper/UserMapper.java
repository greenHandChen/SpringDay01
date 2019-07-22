package com.ceh.mybatis.mapper;

import com.ceh.mybatis.domain.User;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public interface UserMapper {
    User findUserById(Integer id);

}


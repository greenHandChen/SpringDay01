package com.ceh.mybatis.dao;

import com.ceh.mybatis.domain.User;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public interface UserDao {
    User findUserById(Integer id);
}

package com.masirhh.mybatis2.mapper;

import com.masirhh.mybatis2.beans.userBean;

public interface userMapper {
    userBean findUserById(Integer id);
}

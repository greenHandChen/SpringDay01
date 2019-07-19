package com.masirhh.mybatis2.dao;

import com.masirhh.mybatis2.beans.userBean;
import org.springframework.stereotype.Component;


public interface userDao {
    userBean findUserById(Integer id);
}

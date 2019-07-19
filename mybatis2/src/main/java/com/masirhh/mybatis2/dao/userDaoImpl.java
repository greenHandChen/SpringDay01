package com.masirhh.mybatis2.dao;

import com.masirhh.mybatis2.beans.userBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class userDaoImpl extends SqlSessionDaoSupport implements userDao {
    public userBean findUserById(Integer id) {
        return this.getSqlSession().selectOne("com.masirhh.mybatis2.mapper.userMapper.findUserById",id);
    }
}

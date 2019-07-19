package com.ll.ms.dao.impl;

import com.ll.ms.dao.UserDao;
import com.ll.ms.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(int id) throws Exception {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }


}

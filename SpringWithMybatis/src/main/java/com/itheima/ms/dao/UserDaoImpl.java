package com.itheima.ms.dao;

import com.itheima.ms.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(int id) throws Exception {
         return this.getSqlSession().selectOne("test.findUserById",id);
    }

}

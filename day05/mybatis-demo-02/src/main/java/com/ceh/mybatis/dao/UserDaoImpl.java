package com.ceh.mybatis.dao;

import com.ceh.mybatis.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById", id);
    }
}

package com.ljx.mybatisspring.dao.impl;

import com.ljx.mybatisspring.dao.UserDao;
import com.ljx.mybatisspring.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 11:54
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {
        return this.getSqlSession().selectOne("test.findUserById", id);
    }

}

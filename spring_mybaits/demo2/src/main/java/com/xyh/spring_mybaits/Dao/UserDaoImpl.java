package com.xyh.spring_mybaits.Dao;

import com.xyh.spring_mybaits.Entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return super.getSqlSession().selectOne("com.xyh.spring_mybaits.Mapper.UserMapper.findUserById",id);
    }
}

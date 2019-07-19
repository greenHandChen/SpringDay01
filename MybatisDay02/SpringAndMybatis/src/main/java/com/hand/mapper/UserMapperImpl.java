package com.hand.mapper;

import com.hand.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public User findUserById(Integer id){
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}

package com.hand.dao.impl;

import com.hand.bean.User;
import com.hand.dao.UserDao;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        User userById = userMapper.getUserById(id);
        return userById;
    }

}

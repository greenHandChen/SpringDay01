package com.hand.daoImpl;

import com.hand.dao.UserMapper;
import com.hand.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDao1 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public User findUserById(int id) {
        return  this.getSqlSession().selectOne("findUserById",id);
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}

package com.hand.ms.dao;

import com.hand.ms.mapper.UserMapper;
import com.hand.ms.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 15:06
 * @Version 1.0
 */

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {
        return this.getSqlSession().selectOne("test.findUserById",id);

    }


}

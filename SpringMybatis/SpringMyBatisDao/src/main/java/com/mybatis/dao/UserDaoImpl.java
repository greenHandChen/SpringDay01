package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @description: IUserDao的实现类
 * @author: xueWu.Chen
 * @create: 2019-07-19
 **/

public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {
    public User getUserById(int id) {
        return this.getSqlSession().selectOne("SpringDao.getUserById",id);
    }


}

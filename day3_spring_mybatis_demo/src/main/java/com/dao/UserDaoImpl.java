package com.dao;

import com.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 20:48 2019/7/18
 * @Modified By:
 */
//与spring整合后，继承了org.mybatis.spring.support.SqlSessionDaoSupport
//
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }

}

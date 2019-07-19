package com.hand.smybatis.dao;

import com.hand.smybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {



        public User findUserById(Integer id) {

         return   this.getSqlSession().selectOne("test.findUserById",id);

        }

}

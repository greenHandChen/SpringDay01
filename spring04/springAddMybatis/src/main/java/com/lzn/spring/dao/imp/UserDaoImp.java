package com.lzn.spring.dao.imp;

import com.lzn.spring.dao.IUserDao;
import com.lzn.spring.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


public class UserDaoImp extends SqlSessionDaoSupport implements IUserDao {
    public UserEntity findUserById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        UserEntity user = sqlSession.selectOne("user.findUserById", id);
        return user;
    }
}

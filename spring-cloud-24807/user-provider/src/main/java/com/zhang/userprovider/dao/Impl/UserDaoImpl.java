package com.zhang.userprovider.dao.Impl;

import com.zhang.userprovider.dao.UserDao;
import com.zhang.userprovider.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserDaoImpl
 * Author:ZhangChunjia
 * Date:2019/7/26 9:16
 */
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> getAllUsers() {

        return this.getSqlSession().selectList("getAllUsers");
    }

    @Override
    public Integer addUser(User user) {
        this.getSqlSession().update("addUser");
        return 1;
    }

    @Override
    public Integer deleteUser(Integer id) {
        this.getSqlSession().update("deleteUser");
        return 1;
    }

    @Override
    public Integer updateUser(User user) {
        this.getSqlSession().update("updateUser");
        return 1;
    }
}

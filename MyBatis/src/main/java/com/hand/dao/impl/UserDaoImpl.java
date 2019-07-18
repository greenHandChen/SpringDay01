package com.hand.dao.impl;

import com.hand.dao.IUserDao;
import com.hand.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

    public List<User> selectAllUser() {
        sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("User.selectAllUser");
        sqlSession.close();
        return userList;
    }

    public User selectUserById(int id) {
        sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("User.selectUserById", id);
        sqlSession.close();
        return user;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int insertUser(User user) {
        sqlSession = sqlSessionFactory.openSession();
        int result = sqlSession.insert("com.com.hand.mapper.UserMapper.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

}

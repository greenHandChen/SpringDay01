package com.mybatis.demo.storeDao;

import com.mybatis.demo.storeDto.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao  {
    private SqlSessionFactory sqlSessionFactory;


    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }


    public User selectUserInfo(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",id);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    public List<User> selectUser(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user_ls = sqlSession.selectList("test.findUserByName",name);
        sqlSession.commit();
        sqlSession.close();
        return user_ls;
    }

    public int addUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user1 = new User();
        user1.setUsername("杨永信");
        user1.setSex("男");
        user1.setAddress("北京");
        int val = sqlSession.insert("test.inertIntoUser",user1);
        sqlSession.commit();
        sqlSession.close();
        return val;
    }
}

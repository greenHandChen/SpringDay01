package com.st.BeforeDao;

import com.st.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.selectUserById",id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByName(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users= sqlSession.selectList("test.selectUserByUserName",name);
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return 0;
    }
}

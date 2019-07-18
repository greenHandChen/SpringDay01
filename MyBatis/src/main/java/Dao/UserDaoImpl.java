package Dao;

import Entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserByUserId(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserId", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("findUserByUsername",username);
        sqlSession.close();
        return users;
    }

    @Override
    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int val = sqlSession.insert("test.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return val;
    }
}

package dao;

import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",id);
        System.out.println(user);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("test.findUserByUsername"," '%'" + username +"'%' ");
        System.out.println(users);
        sqlSession.close();
        return users;
    }
}

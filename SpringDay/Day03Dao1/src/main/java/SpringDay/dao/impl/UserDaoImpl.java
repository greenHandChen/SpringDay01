package SpringDay.dao.impl;

import SpringDay.dao.UserDao;
import SpringDay.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/18.
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }



    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", 1);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("test.findUserByUsername", "'%"+username+"%'");
        sqlSession.close();
        return userList;
    }

    @Override
    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("test.addUser", user);
        return insert;
    }
}

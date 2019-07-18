package club.osai.dao;

import club.osai.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDaoImpl.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */

public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(Long id) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        User User = sqlSession.selectOne("club.osai.mapper.UserMapper.findUserById", id);
        sqlSession.close();
        return User;
    }

    @Override
    public List<User> findUserByUsername(String username) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("club.osai.mapper.UserMapper.findUserByUsername", "'%" + username + "%'");
        sqlSession.close();
        return users;
    }

    @Override
    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("club.osai.mapper.UserMapper.addUser", user);
        sqlSession.close();
        return insert;
    }
}

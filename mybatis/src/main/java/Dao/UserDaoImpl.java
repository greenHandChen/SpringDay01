package Dao;

import Domin.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //全局唯一
    private SqlSessionFactory sqlSessionFactory;

    //模拟Spring使用set方法注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(String id) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("test.findUserByUsername","%"+username+"%");

        sqlSession.close();
        return users;
    }

    public int addUser(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();


        int val = sqlSession.insert("test.addUser",user);

        return val;
    }

    
}

package Dao;

import Domin.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    //    //全局唯一
    //    //全局唯一
    //
//    //模拟Spring使用set方法注入


//    public User findUserById(String id) {
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        User user = sqlSession.selectOne("test.findUserById",id);
//        sqlSession.close();
//        return user;
//    }
//
//    public List<User> findUserByUsername(String username) {
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        List<User> users = sqlSession.selectList("test.findUserByUsername","%"+username+"%");
//
//        sqlSession.close();
//        return users;
//    }
//
//    public int addUser(User user) {
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//
//        int val = sqlSession.insert("test.addUser",user);
//
//        return val;
//    }

    public User findUserById(String id) {
        return null;
    }

    public List<User> findUserByUsername(String username) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public User UsingSpringFindUserById(String id) {
        return this.getSqlSession().selectOne("Dao.UserMapper.UsingSpringFindUserById", id);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        User user = sqlSession.selectOne("Dao.UserMapper.UsingSpringFindUserById",id);
//        sqlSession.close();
//        return user;

    }


}

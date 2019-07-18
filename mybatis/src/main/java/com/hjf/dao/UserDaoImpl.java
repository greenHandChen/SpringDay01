//package com.hjf.dao;
//
//import com.hjf.pojo.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//
//import java.util.List;
//
///**
// * ClassName:UserDaoImpl
// * Author:Hejunfeng
// * Date:2019/7/18 15:18
// */
//public class UserDaoImpl implements UserDao {
//   private SqlSessionFactory sqlSessionFactory;
//
//   public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
//       this.sqlSessionFactory=sqlSessionFactory;
//   }
//
//    public User findUserById(Integer id) {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user = sqlSession.selectOne("test.findUserById",id);
//        sqlSession.close();
//        return user;
//    }
//
//    public List<User> findUserByUsername(String username) {
//        return null;
//    }
//
//    public int addUser(User user) {
//        return 0;
//    }
//}
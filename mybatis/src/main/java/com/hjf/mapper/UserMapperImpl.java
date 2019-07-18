package com.hjf.mapper;

import com.hjf.pojo.User;
import com.hjf.pojo.UserQueryVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UserDaoImpl
 * Author:Hejunfeng
 * Date:2019/7/18 15:18
 */
public class UserMapperImpl implements UserMapper {
   private SqlSessionFactory sqlSessionFactory;

   public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
       this.sqlSessionFactory=sqlSessionFactory;
   }

    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("userMapper.findUserById",id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public List<User> findUserByUser(UserQueryVO userQueryVO) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectOne("findUserByUser",userQueryVO);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByMap(Map<String, String> map) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectOne("findUserByMap",map);
        sqlSession.close();
        return user;
    }

    public int countUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int counts = sqlSession.selectOne("countUser");
        sqlSession.close();
        return counts;
    }

    public User findUserNameAndAddressById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findUserNameAndAddressById",id);
        sqlSession.close();
        return user;
    }

    public User testResultMap(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("testResultMap",id);
        sqlSession.close();
        return user;
    }

}
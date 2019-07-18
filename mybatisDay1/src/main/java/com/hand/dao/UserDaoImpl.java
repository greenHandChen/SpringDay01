package com.hand.dao;

import com.hand.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {

    InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
    SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);


    public UserDaoImpl() throws IOException {
    }


    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
    this.sf=sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession=sf.openSession();
        User mapper = sqlSession.selectOne("com.hand.mapper.UserMapper.findUserById",id);
        sqlSession.close();
        return mapper;
    }

    public List<User> findByUsername(String username) {
        SqlSession sqlSession=sf.openSession();
        List<User> list = sqlSession.selectList("com.hand.mapper.UserMapper.findUserByUsername", username);
        sqlSession.close();
        return list;
    }

    public int insertInfo(User user) {
        SqlSession sqlSession=sf.openSession();
        int i = sqlSession.insert("com.hand.mapper.UserMapper.insertInfo", user);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}

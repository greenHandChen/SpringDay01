package org.hgh.test.day2;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hgh.dao.mapper.UserMapper;
import org.hgh.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatisCache {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testLevel1Cache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserCounts());

//        User user = new User();
//        user.setUsername("asda");
//        userMapper.addUser(user);

        System.out.println(userMapper.getUserCounts());
    }

    @Test
    public void testLevel2Cache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession1 = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);

        userMapper.findUserById(1);
        sqlSession.close();

        userMapper1.findUserById(1);
        sqlSession1.close();

    }
}

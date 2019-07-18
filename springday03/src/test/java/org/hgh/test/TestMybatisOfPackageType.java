package org.hgh.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.dao.mapper.UserMapper;
import org.hgh.pojo.User;
import org.hgh.vo.UserVO;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatisOfPackageType {
    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public TestMybatisOfPackageType() throws IOException {
    }

    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVO userVO = new UserVO(null,null,1,"上");
        System.out.println(userMapper.findUserByUser(userVO));
        sqlSession.close();
    }

    @Test
    public void test02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVO userVO = new UserVO(null,null,2,"河南");
        System.out.println(userMapper.findUserByAddressAndSex(userVO));
        sqlSession.close();
    }

    @Test
    public void Test03(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String ,Object> map = new HashMap<String, Object>();
        map.put("username","王");
        map.put("sex",2);
        System.out.println(userMapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void Test04(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserCounts());
        sqlSession.close();
    }

    @Test
    public void Test05(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUsernameAndAddressById(10));
        sqlSession.close();
    }


    @Test
    public void Test06(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap());
        sqlSession.close();
    }
}

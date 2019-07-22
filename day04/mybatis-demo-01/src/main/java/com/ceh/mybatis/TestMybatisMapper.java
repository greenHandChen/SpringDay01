package com.ceh.mybatis;

import com.ceh.mybatis.domain.User;
import com.ceh.mybatis.domain.UserQueryVO;
import com.ceh.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public class TestMybatisMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testDao() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(33));
        sqlSession.close();
    }

    @Test
    public void testA() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setAddress("河南");
        user.setSex(2);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }

    @Test
    public void testMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testCount() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public void testB() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserNameAndAddressById(33));
        sqlSession.close();
    }

    @Test
    public void testUserResultMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.testResultMap(33));
        sqlSession.close();
    }

    @Test
    public void testLabel() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }
}

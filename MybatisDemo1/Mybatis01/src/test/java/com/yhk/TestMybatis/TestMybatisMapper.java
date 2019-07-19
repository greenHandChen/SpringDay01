package com.yhk.TestMybatis;

import com.yhk.Mapper.UserMapper;
import com.yhk.Pojo.User;
import com.yhk.Pojo.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatisMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public  void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testMybatisMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(29));
        sqlSession.close();
    }

    @Test
    public void testUserQueryVO(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }

    @Test
    public void testMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testCount(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public void testUsernameAndAddress(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUsernameAndAddressById(27).getUsername());
        System.out.println(mapper.findUsernameAndAddressById(27).getAddress());
        sqlSession.close();
    }

    @Test
    public void testResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.testResultMap(27));
        sqlSession.close();
    }

    @Test
    public void testIfAndWhere(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhere(user));
        sqlSession.close();
    }

    /**
     * 综合查询 动态sql
     */
    @Test
    public void testUserList(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();

        List<Integer> idList=new ArrayList<Integer>();
        idList.add(27);
        idList.add(234);
        idList.add(30);

        userQueryVO.setIdList(idList);


        User user=new User();
//        user.setUsername("杨");
//        user.setSex(1);
        userQueryVO.setUser(user);

        System.out.println(mapper.findUserList(userQueryVO));
        sqlSession.close();
    }
}

package com.ll.mybatis.test;

import com.ll.mybatis.mapper.UserMapper;
import com.ll.mybatis.po.User;
import com.ll.mybatis.po.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById(){
        //创建UserMappers对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //由Mybatis通过sqlsession来创建Mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findUserById(24);

        System.out.println(user);

        sqlSession.close();

    }

    @Test
    public void testInsertUser(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();

        user.setUsername("David");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("ChengDu");
        mapper.insertUser(user);

        System.out.println(user.getId());

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindUserList(){
        //创建UserMappers对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //由Mybatis通过sqlsession来创建Mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVO vo = new UserQueryVO();

        User user = new User();

//        user.setUsername("a");
//        user.setSex("2");

        vo.setUser(user);

        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(23);
        idList.add(24);
        idList.add(25);

        vo.setIdlist(idList);

        List<User> users = mapper.findUserList(vo);

        users.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testFindUserByHashMap(){
        //创建UserMappers对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //由Mybatis通过sqlsession来创建Mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String,String> map = new HashMap<>();

        map.put("name","a");

        map.put("gender","1");

        List<User> users = mapper.findUserByMap(map);

        users.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testFindUserCount(){
        //创建UserMappers对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //由Mybatis通过sqlsession来创建Mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVO vo = new UserQueryVO();

        User user = new User();

        user.setUsername("明");
        user.setSex("1");

        vo.setUser(user);

        int counts = mapper.findUserCount(vo);

        System.out.println(counts);

        sqlSession.close();
    }

    @Test
    public void testFindUserRstMap(){
        //创建UserMappers对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //由Mybatis通过sqlsession来创建Mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findUserRstMap(1);

        System.out.println(user);

        sqlSession.close();
    }





}

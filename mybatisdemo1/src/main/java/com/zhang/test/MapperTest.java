package com.zhang.test;

import com.zhang.mapper.UserMapper;
import com.zhang.pojo.User;
import com.zhang.pojo.UserQueryVo;
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
 * ClassName:MapperTest
 * Author:ZhangChunjia
 * Date:2019/7/18 14:35
 */
public class MapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapperConfig-2.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void testMapperDemo(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserById(1).toString());
        sqlSession.close();
    }

    //通过包装User类型综合查询
    @Test
    public void testMapperVoDemo(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        UserQueryVo userQueryVo=new UserQueryVo();
        User user=new User();
        user.setAddress("海");
        user.setSex(1);
        userQueryVo.setUser(user);
        System.out.println(userMapper.findUserByUser(userQueryVo));
        sqlSession.close();
    }

    @Test
    public void testMapperMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Map<String,String> map=new HashMap<String, String>();
        map.put("username","上");
        System.out.println(userMapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testMapperDemo2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user=userMapper.findNameAndAddressById(1);
        System.out.println("username:"+user.getUsername()+"   address:"+user.getAddress());
        sqlSession.close();
    }

    @Test
    public void testUserResultMap(){
        SqlSession sqlSession= sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //结果映射resultMap 测试结果打印
        User user=userMapper.userResultMapTest(1);
        System.out.println("id:"+user.getId()+"  username:"+user.getUsername()+"   address:"+user.getAddress());
        sqlSession.close();
    }

    @Test
    public void testWhereAndIfLabel(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setId(1);
        User user1=userMapper.whereAndIfLabelTest(user);
        System.out.println("id:"+user1.getId()+"  username:"+user1.getUsername()+"   address:"+user1.getAddress());
        sqlSession.close();
    }

    @Test
    public void testCountUser(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
    }
}

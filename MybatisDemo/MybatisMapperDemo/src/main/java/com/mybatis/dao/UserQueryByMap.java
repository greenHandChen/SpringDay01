package com.mybatis.dao;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.pojo.UserQueryPojo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 通过Map封装的信息传入Mapper.xml文件中，进行赋值查询
 * @author: xueWu.Chen
 * @create: 2019-07-18
 **/

public class UserQueryByMap {
    @Test
    public void test04()throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数时命名空间.sql的ID，第二个参数是查询的参数
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<String, String>();
        map.put("username","小");

        List<User> u = userMapper.findUserByMap(map);
        for(User user:u){
            System.out.println(user.getId()+" "+user.getUsername());
        }
        sqlSession.close();
    }


    @Test
    public void test05()throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数时命名空间.sql的ID，第二个参数是查询的参数
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User u = userMapper.findUserReturnMap(33);
        System.out.println(u.getId()+" "+u.getUsername()+" "+u.getSex());
    }

}

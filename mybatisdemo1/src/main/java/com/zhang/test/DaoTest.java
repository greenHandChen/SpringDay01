package com.zhang.test;

import com.zhang.mapper.UserMapper;
import com.zhang.mapper.impl.UserMapperImpl;
import com.zhang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:DaoTest
 * Author:ZhangChunjia
 * Date:2019/7/18 11:52
 */
public class DaoTest {

    //private UserMapperImpl userMapper;
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapperConfig-1.xml");
        //2.创建SqlsessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testMapperDemo1(){
        UserMapperImpl userMapper =new UserMapperImpl();
        userMapper.setSqlSessionFactory(sqlSessionFactory);
        User u=new User();
        userMapper.findUserByName("张");
        System.out.println(u.toString());
    }

    @Test
    public void testMapperDemo2(){
        UserMapperImpl userMapper=new UserMapperImpl();
        userMapper.setSqlSessionFactory(sqlSessionFactory);
        User u=new User();
        u=userMapper.findUserById(1);
        System.out.println(u.toString());
    }

    @Test
    public void testMapperDemo3(){
        UserMapperImpl userMapper=new UserMapperImpl();
        userMapper.setSqlSessionFactory(sqlSessionFactory);
        List<User> list=new ArrayList<User>();
        list=userMapper.findUsers();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}

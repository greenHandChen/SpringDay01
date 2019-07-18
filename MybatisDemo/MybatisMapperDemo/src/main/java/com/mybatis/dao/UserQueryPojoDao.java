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
import java.util.List;

/**
 * @description: 利用Pojo封装查询的dao
 * @author: xueWu.Chen
 * @create: 2019-07-18
 **/

public class UserQueryPojoDao {
    @Test
    public void Test03() throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数时命名空间.sql的ID，第二个参数是查询的参数
        UserQueryPojo userQueryPojo = new UserQueryPojo();
        User user = new User();
        user.setSex("2");
        user.setAddress("河南");
        userQueryPojo.setUser(user);
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);

        User u = userMapper.findUserByPojo(userQueryPojo);
        System.out.println(u.getId()+" "+u.getUsername());
        sqlSession.close();
    }
}

package com.mybatis.dao;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * author: ChenXW
 * date: 2019/7/18 15:49
 */
public class UserDao {
    @Test
    public void findUserInfoById() throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数时命名空间.sql的ID，第二个参数是查询的参数
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);
        List<User>  user = userMapper.findUserByName("'张%'");
        for (User s:user
        ) {
            System.out.println(s);
        }
        sqlSession.close();

    }
}

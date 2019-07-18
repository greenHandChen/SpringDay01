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
 * @description: where  and   if
 * @author: xueWu.Chen
 * @create: 2019-07-18
 **/

public class QueryByWhereAndIf {
    @Test
    public void Test03() throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(24);
        user.setAddress("河南");
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);

        List<User> u = userMapper.findUserByWhereAndIf(user);
        if (u.isEmpty()){
            System.out.println("没有符合条件的结果");
        }else {
        for(User user1:u){
            System.out.println(user1.getId()+" "+user1.getUsername()
                    +" "+user1.getAddress());
        }
        }
    }
}

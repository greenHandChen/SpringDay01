package com.hand.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisFirst {
    @Test
    public void  findUserById() throws IOException {
        //读取配置文件
        //全局配置文件路径
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SQLSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession sqlSession= sqlSessionFactory.openSession();

        //调用Sqlsession的增删改查方法
       /* //第一个参数 表示statement的唯一标识
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.getName());*/

        //根据用户那么模糊查询用户列表
        /*List<User> list=sqlSession.selectList("test.findUsersByName","小明");
        for(User user:list)
            System.out.println(user.getName()+" ");*/

        //插入数据，同事注意提交，commit
        User user=new User();
        //user.setId(13);
        user.setName("xoyean");
        sqlSession.insert("test.insertUser",user);
        sqlSession.commit();
        System.out.println(user.getId());
        //关闭资源
        sqlSession.close();
    }
}
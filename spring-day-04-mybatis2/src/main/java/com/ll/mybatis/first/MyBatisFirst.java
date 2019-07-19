package com.ll.mybatis.first;

import com.ll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisFirst {

    @Test
    public void findUserByIdTest() throws Exception {
        //读取配置文件
        //全局配置文件
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SQLSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建Sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用sqlSession的增删改查方法
        //第一个参数，表示statement的唯一标识
        //第二个参数，表示传入参数类型
        User user = sqlSession.selectOne("UserMapper.findUserById", 1);
        System.out.println(user);

        //关闭资源
        sqlSession.close();

    }

    @Test
    public void findUserByNameTest() throws Exception {
        //读取配置文件
        //全局配置文件
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SQLSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建Sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用sqlSession的增删改查方法
        //第一个参数，表示statement的唯一标识
        //第二个参数，表示传入参数类型
        List<User> users = sqlSession.selectList("UserMapper.findUserByName", "小明");
        users.forEach(System.out::println);

        //关闭资源
        sqlSession.close();

    }
    @Test
    public void insertUser() throws Exception {
        //读取配置文件
        //全局配置文件
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SQLSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建Sqlsession ->自动创建了事务
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("Bob");
        user.setSex("2");
        user.setAddress("Tokyo");

        //调用sqlSession的增删改查方法
        //第一个参数，表示statement的唯一标识
        //第二个参数，表示传入参数类型
        sqlSession.insert("UserMapper.insertUser", user);
        System.out.println(user.getId());

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();

    }

//    public void add(int i){
//        i = i+ 1;
//    }
//    @Test
//    public void main(){
//        int a = 1;
//        add(a);
//        System.out.println(a);
//    }


}

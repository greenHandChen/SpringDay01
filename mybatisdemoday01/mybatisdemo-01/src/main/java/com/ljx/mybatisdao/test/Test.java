package com.ljx.mybatisdao.test;

import com.ljx.mybatisdao.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author LinJianXiong
 * @Date 2019/7/18
 * @Time 9:54
 */

public class Test {

    @org.junit.Test
    public void findUserByIdTest() throws IOException {
        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行查询，第一个参数是命名空间.sql的id,第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user.getAddress());

        //5.l关闭sqlSession(关闭连接)
        sqlSession.close();
    }

    @org.junit.Test
    public void insertUserTest() throws Exception{
        //读取配置文件
        //全局配置文件的路径
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("东哥hm19");
        user.setAddress("宝盛西里24号楼");

        //调用SqlSession的增删改查方法
        //第一个参数：表示statement的唯一标示
        sqlSession.insert("test.insertUser", user);

        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}

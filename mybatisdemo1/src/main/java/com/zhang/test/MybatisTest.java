package com.zhang.test;

import com.zhang.pojo.User;
import com.zhang.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/**
 * ClassName:MybatisTest
 * Author:ZhangChunjia
 * Date:2019/7/18 9:27
 */
public class MybatisTest {

    @Test
    public void testDemo1() throws IOException {
        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapperConfig-1.xml");
        //2.创建SqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.读取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询,第一个带参数的是命名空间,sql的id,第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserByName", "张%");
        System.out.println(user.toString());
        //5.关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testDemo2() throws IOException {
        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapperConfig-1.xml");
        //2.创建SqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.读取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(2);
        user.setUsername("上海汉得");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("上海");

        int val = sqlSession.insert("test.addUser", user);
        System.out.println(val);

        //4.提交事务
        sqlSession.commit();
        //5.关闭连接
        sqlSession.close();

    }

    @Test
    public void testDemo3() throws IOException {
        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapperConfig-1.xml");
        //2.创建SqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.读取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        //user.setId(2);
        user.setUsername("安徽信息工程学院");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("安徽芜湖");

        sqlSession.insert("test.addUserAndGetId", user);
        System.out.println(user.getId());

        //4.提交事务
        sqlSession.commit();
        //5.关闭连接
        sqlSession.close();

    }

    @Test
    public void testDemo4() throws IOException {

        //1.读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapperConfig-1.xml");
        //2.创建SqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.读取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User1 user = new User1();
        //user.setId("dasdasdas");
        user.setUsername("长沙理工大学");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("长沙市天心区");

        sqlSession.insert("test.addUserAndGetUUID", user);
        System.out.println(user.getId());

        //4.提交事务
        sqlSession.commit();
        //5.关闭连接
        sqlSession.close();

    }
}

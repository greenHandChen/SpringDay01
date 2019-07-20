package com.yhk.TestMybatis;

import com.yhk.Pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    //1.读取全局配置文件
    InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
    //2.创建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);


    public TestMybatis() throws IOException {
    }

    /**
     * 根据用户ID查询用户信息
     */
    @Test
    public void demo1() throws IOException {
        //3.获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4执行查询 ,第一个参数是命名空间.sql的ID， 第二个参数查询的参数
        User user=sqlSession.selectOne("test.findUserById",10);
        System.out.println(user);
        //5.关闭资源
        sqlSession.close();
    }

    /**
     * 根据用户名模糊查询
     */
    @Test
    public void demo2(){
        //3.获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4执行查询 ,第一个参数是命名空间.sql的ID， 第二个参数查询的参数
        List<User> users=sqlSession.selectList("test.findUserByUsername","'张%'");
        System.out.println(users.toString());
        //5.关闭资源
        sqlSession.close();
    }

    /**
     * 添加用户
     */
    @Test
    public void demo3(){
        //3.获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //创建User对象
        User user = new User();
        user.setUsername("杨鸿坤");
        user.setAddress("上海汉德");
        user.setBirthday(null);
        user.setSex(1);
        //4.添加用户
        int i=sqlSession.insert("addUser",user);
        System.out.println(i);
        //5.提交事务
        sqlSession.commit();
        //6.关闭
        sqlSession.close();
    }

    /**
     *添加用户返回自增主键(Mysql)
     */
    @Test
    public void demo4(){
        //3.获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //创建User对象
        User user = new User();
        user.setUsername("安徽");
        user.setAddress("工信大");
        //4.添加用户
        int i=sqlSession.insert("addUserGetId",user);
        System.out.println(user.getId());
        //5.提交事务
        sqlSession.commit();
        //6.关闭
        sqlSession.close();
    }
}

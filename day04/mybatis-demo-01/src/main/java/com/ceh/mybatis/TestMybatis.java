package com.ceh.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.ceh.mybatis.domain.User;

/**
 * Created by enHui.Chen on 2019/7/8.
 */
public class TestMybatis {

    /**
     * @Author: enHui.Chen
     * @Description: 根据用户ID查询用户信息
     * @Data 2019/7/8
     */
    @Test
    public void demo01() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.执行查询,第一个参数是命名空间.sql的ID,第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        // 5.关闭sqlSession(释放连接)
        sqlSession.close();
    }

    /**
     * @Author: enHui.Chen
     * @Description: 根据用户名模糊查询用户信息
     * @Data 2019/7/8
     */
    @Test
    public void demo02() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.${}占位符的sql注入演示
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%明%' OR 1=1");
        System.out.println(users);
        // 5.关闭sqlSession(释放连接)
        sqlSession.close();
    }

    /**
     * @Author: enHui.Chen
     * @Description: 添加用户
     * @Data 2019/7/8
     */
    @Test
    public void demo03() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.${}占位符的sql注入演示
        User user = new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        int val = sqlSession.insert("test.addUser", user);
        System.out.println(val);
        // 5.提交事务
        sqlSession.commit();
        // 6.关闭sqlSession(释放连接)
        sqlSession.close();
    }

    /**
     * @Author: enHui.Chen
     * @Description: 添加用户返回自增主键-byMysql
     * @Data 2019/7/8
     */
    @Test
    public void demo04() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.${}占位符的sql注入演示
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        // 5.提交事务
        sqlSession.commit();
        // 6.关闭sqlSession(释放连接)
        sqlSession.close();
    }

}

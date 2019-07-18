package com.yts.test;

import com.yts.beans.User;
import com.yts.dao.UserDao;
import com.yts.dao.UserDaoImpl;
import com.yts.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        // 读取全剧配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        //创建sessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo() throws IOException {
        // 读取全剧配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user.toString());

        // 关闭sqlsession（释放连接）
        sqlSession.close();

    }

    @Test
    public void test() throws IOException {
        // 读取全剧配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        List<User> users = sqlSession.selectList("test.findUserByUsername", "明");
        System.out.println(users.toString());

        // 关闭sqlsession（释放连接）
        sqlSession.close();
    }

    @Test
    public void testInsert() throws IOException {
        // 读取全剧配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        user.setSex(1);
        user.setBirthday(new Date(111));

        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        int val = sqlSession.insert("test.addUser", user);
        sqlSession.commit();
        System.out.println(val);
        System.out.println(user.getId());

        // 关闭sqlsession（释放连接）
        sqlSession.close();
    }

    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(34));
        System.out.println(userDao.findUserByUsername("汉"));
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("芜湖");
        System.out.println(userDao.addUser(user));
    }

    @Test
    public void testMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(34));
        sqlSession.close();
    }
}

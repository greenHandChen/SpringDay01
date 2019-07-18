package com.hand.mybatis.mapper;

import com.hand.mybatis.dao.UserDao;
import com.hand.mybatis.dao.UserDaoImpl;
import com.hand.mybatis.po.User;
import com.hand.mybatis.po.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 16:56
 * @Version 1.0
 */

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void SetUp() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testfindUserById() throws Exception {
        //创建UserMapper对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //由Mybatis通过sqlsession来创建代理对象
        UserMapper mapper1=sqlSession.getMapper(UserMapper.class);
        User user=mapper1.findUserById(29);
        System.out.println(user);
        sqlSession.close();
    }



    @Test
    public void testinsertUser() throws Exception {
        //创建UserMapper对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //由Mybatis通过sqlsession来创建代理对象
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("熊依琳33333");
        user.setAddress("深圳33333");
        mapper.insertUser(user);
        System.out.println(user.getId());

        //不提交则只存在于缓冲区
        sqlSession.commit();
        sqlSession.close();

    }

    //有点问题
    @Test
    public void testfindUserList() throws Exception {
        //创建UserMapper对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //由Mybatis通过sqlsession来创建代理对象
        UserMapper mapper1=sqlSession.getMapper(UserMapper.class);

        UserQueryVO vo=new UserQueryVO();
        User user=new User();
        user.setUsername("小明");
        user.setSex("1");
        vo.setUser(user);

        List<User> list=mapper1.findUserList(vo);
        int count=mapper1.findUserCount(vo);

        System.out.println(list);
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void testfindUserRstMap() throws Exception {
        //创建UserMapper对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //由Mybatis通过sqlsession来创建代理对象
        UserMapper mapper1=sqlSession.getMapper(UserMapper.class);

        User user=mapper1.findUserRstMap(1);

        System.out.println(user);
        sqlSession.close();
    }
}

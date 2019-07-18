package com.lhb;

import com.lhb.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created By LHB on 2019/7/18;
 */
public class Test_Mybatis01 {
    InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    public Test_Mybatis01() throws IOException {
    }

    @Test
    public void demo01() throws IOException {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();


    }



    @Test
    public void demo02() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("test.findUserByUsername","'%明%' OR 1=1");
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void demo03() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user =new User();
        user.setUsername("雷军");
        user.setAddress("仙桃");
        int val = sqlSession.insert("test.addUser", user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void demo04() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user =new User();
        user.setUsername("斗鱼");
        user.setAddress("武汉");
        int val = sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void demo05() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user =new User();
        user.setUsername("小米总部");
        user.setAddress("北京");
        int val = sqlSession.insert("test.addUserGetUUID", user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

}

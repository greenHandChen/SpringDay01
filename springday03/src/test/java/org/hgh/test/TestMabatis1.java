package org.hgh.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMabatis1 {
    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession  = sqlSessionFactory.openSession();

    public TestMabatis1() throws IOException {
    }

    @Test
    public void test01() throws IOException {
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test02(){
        List<User> users = sqlSession.selectList("test.findUserByUsername","'%明%' or 1=1");
        System.out.println(users);
        sqlSession.close();
    }


    @Test
    public void test03(){
        User user= new User("汉得",new Date(),1,"上海");
        int result = sqlSession.insert("test.addUser",user);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void test04(){
        User user = new User("bilibili",new Date(),0,"北京");
        int result = sqlSession.insert("test.addUserGetId",user);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void test05(){
        User user = new User("工薪大",new Date(),0,"安徽");
        int result = sqlSession.insert("test.addUserGetUUID",user);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

}

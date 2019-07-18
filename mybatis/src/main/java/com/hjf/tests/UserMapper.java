//package com.hjf.tests;
//
//import com.hjf.pojo.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class UserMapper {
//
//    @Test
//    public void demo1() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user =sqlSession.selectOne("test.findUserById",1);
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void demo2() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<User> users =sqlSession.selectList("test.findUserByUsername","'%明%'or 1=1");
//        System.out.println(users);
//        sqlSession.close();
//    }
//
//
//    @Test
//    public void demo4() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user=new User();
//        user.setUsername("工信大");
//        user.setAddress("长沙");
//        sqlSession.insert("test.addUserGetId",user);
//        System.out.println(user);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void demo5() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user=new User();
//        user.setUsername("农大");
//        user.setAddress("四川");
//        sqlSession.insert("test.addUserGetUUID",user);
//        System.out.println(user);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void demo6() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user=new User();
//        user.setUsername("喝水");
//        user.setAddress("核算");
//        sqlSession.insert("test.addUserGetID2",user);
//        System.out.println(user);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//}

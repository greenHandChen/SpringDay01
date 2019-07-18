package com.zd;

import com.zd.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {

    private  SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws  IOException{
        //1.读取配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        //2.创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void demo01() throws IOException {

        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询，第一个参数是命sql的id
        User user = sqlSession.selectOne("com.zd.UserMapper.findUserById",1);
        System.out.println(user.getUsername());
        //5.关闭sqlSession连接
        sqlSession.close();

    }

    @Test
    public void Demo2() throws IOException{

        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("com.zd.UserMapper.findUserByUsername","'%明'");
        for (User user:users) {
            System.out.println(user.getUsername());
        }
        sqlSession.close();

    }

    @Test
    public void  Demo3()throws IOException{

        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User(1,"阿登",new Date(),1,"湖北");
        sqlSession.insert("com.zd.UserMapper.addUser",user);
        sqlSession.commit();
        System.out.println("添加成功");
        sqlSession.close();
    }

    @Test
    public void  Demo4()throws IOException{

        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("阿凡");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("湖北");
        sqlSession.insert("com.zd.UserMapper.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDao(){
        SqlSession sqlsession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserById(1));
        sqlsession.close();

    }
}

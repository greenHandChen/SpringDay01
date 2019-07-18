package huanglehao.study.first;

import huanglehao.study.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 10:53 2019/7/18
 */
public class MybatisFirst {
    @Test
    public void findUserByIdTest() throws IOException {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //调用sqlsession的增删改查方法
        User user=sqlSession.selectOne("user.findUserById",1);
        //关闭资源
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void findUserByNameTest() throws IOException {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //调用sqlsession的增删改查方法
        List<User> userList=sqlSession.selectList("user.findUserByUserName","张小明");
        //关闭资源
        sqlSession.close();
        System.out.println(userList);
    }


    @Test
    public void insertUserTest() throws IOException {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("hhh");
        user.setAddress("天堂");
        user.setBirthday(new Date());
        user.setSex("1");
        //调用sqlsession的增删改查方法
        sqlSession.insert("user.insertUser",user);
        System.out.println("----------------------------");
        System.out.println(user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        System.out.println("----------------------------");
        System.out.println(user);
        System.out.println(user.getId());
        //关闭资源
        sqlSession.close();
    }

    @Test
    public void insertUser2Test() throws IOException {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("hhh");
        user.setAddress("天堂");
        user.setBirthday(new Date());
        user.setSex("1");
        //调用sqlsession的增删改查方法
        sqlSession.insert("user.insertUser2",user);
        System.out.println("----------------------------");
        System.out.println(user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        System.out.println("----------------------------");
        System.out.println(user);
        System.out.println(user.getId());
        //关闭资源
        sqlSession.close();
    }
}

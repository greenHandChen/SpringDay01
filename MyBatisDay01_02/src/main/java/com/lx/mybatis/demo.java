package com.lx.mybatis;

import com.lx.mybatis.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class demo {

    @Test
    public void demo01() throws IOException {
        //1、读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2、创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数是命名空间及标识符id，第二个是参数
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        //5、关闭sqlSession(释放连接)
        sqlSession.close();
    }

    /**
     * 测试${}sql注入
     * @throws IOException
     */
    @Test
    public void demo02() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("test.findUserByUsername","'%明%'");
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void demo03() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("李四");
        user.setAddress("上海");
        int val = sqlSession.insert("test.addUser",user);
        System.out.println("val:"+val);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void demo04() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("王三运");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId",user);
        System.out.println("id:"+user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}

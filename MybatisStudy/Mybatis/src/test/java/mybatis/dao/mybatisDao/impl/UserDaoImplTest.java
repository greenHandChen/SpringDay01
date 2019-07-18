package mybatis.dao.mybatisDao.impl;

import mybatis.enity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private static SqlSession sqlSession = null;

    @Before
    public void setUp() throws IOException {
        String resouce = "Mybatis_Config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void destory() {
        sqlSession.close();
    }

    @Test
    public void DaoTest() {
        UserDaoImpl userDao = new UserDaoImpl(sqlSession);
//      根据ID查询用户
        System.out.println(userDao.findUserById(33));
//      根据用户名查询
        System.out.println(userDao.findUserByUsername("张"));
//      添加用户
        User user = new User();
        user.setUsername("hand");
        user.setAddress("芜湖");

        System.out.println(userDao.addUser(user));
    }

}
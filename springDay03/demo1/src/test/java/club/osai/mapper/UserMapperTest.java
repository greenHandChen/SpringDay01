package club.osai.mapper;

import club.osai.po.User;
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

import static org.junit.Assert.*;

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        //读取配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(1L);
        System.out.println(userById);
        sqlSession.close();

    }

    @Test
    public void findUserByUsername() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.findUserByUsername("'%陈%'");
        System.out.println(users);
        sqlSession.close();


    }

    @Test
    public void addUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex(1);
        user.setAddress("上海汉得");
        user.setBirthday(new Date());
        user.setUsername("陈权222");
        int i = mapper.addUser(user);
        if (i > 0) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void findUsernameAndAddressById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUsernameAndAddressById(33L);
        System.out.println(user);
        sqlSession.close();

    }

    @Test
    public void findUsernameAndAddressByIdWithMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUsernameAndAddressByIdWithMap(33L);
        System.out.println(user);
        sqlSession.close();

    } @Test
    public void testIfAndWhereLabel() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("上海");
        user.setUsername("陈权");
        List<User> users = mapper.testIfAndWhereLabel(user);
        System.out.println(users);
        sqlSession.close();

    }


}
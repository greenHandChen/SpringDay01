package club.osai.vo;

import club.osai.mapper.UserMapper;
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
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class UserQueryVOTest {
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
    public void findUserByUser() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("上海汉得");
        user.setUsername("陈权");
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);
        List<User> userByUser = mapper.findUserByUser(userQueryVO);
        System.out.println(userByUser);
        sqlSession.close();

    }

    @Test
    public void findUserByMap() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("username", "陈");

        List<User> userByUser = mapper.findUserByMap(stringStringHashMap);
        System.out.println(userByUser);
        sqlSession.close();


    }

    @Test
    public void countUser() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        sqlSession.close();

        long l = mapper.countUser();
        System.out.println(l);

    }
}
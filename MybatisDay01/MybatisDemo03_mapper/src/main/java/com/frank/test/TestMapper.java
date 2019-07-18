package com.frank.test;

import com.frank.mapper.UserMapper;
import com.frank.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMapper {
    @Test
    public void test01() throws IOException {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //根据id查询用户
        User user = mapper.findUserById(1);
        System.out.println(user);
        //根据用户的姓查询用户列表
        List<User> list = mapper.findUserByUsername("张");
        for (User user1 : list) {
            System.out.println(user1);
        }
        //添加用户
        User user2 = new User();
        user2.setUsername("关羽");
        user2.setBirthday(new Date());
        user2.setSex(2);
        user2.setAddress("长沙");
        int row = mapper.addUser(user2);
        System.out.println("影响了"+row+"行");
        sqlSession.commit();
        sqlSession.close();

    }
}

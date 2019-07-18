package com.xyh.mybaits;

import com.xyh.mybaits.Entity.User;
import com.xyh.mybaits.Entity.UserQuery;
import com.xyh.mybaits.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMapperTest {

    private UserMapper userMapper;

    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        String resource = "MybaitsConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void findUserById() {
        User user = userMapper.findUserById(1);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByUserQuery() {
        User user = new User();
        user.setUsername("五");
        user.setSex("男");
        UserQuery userQuery = new UserQuery();
        userQuery.setUser(user);

        List<User> users = userMapper.findUserByUserQuery(userQuery);
        System.out.println(users.size());
    }

    @Test
    public void findUserRstById() {
        User user = userMapper.findUserRstById(2);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByName() {
        List<User> users = userMapper.findUserByName("五");
        System.out.println(users.size());
    }

    @Test
    public void findUserByCondition() {
        User user = new User();
        user.setSex("男");
        List<User> users1 = userMapper.findUserByCondition(user);
        user.setUsername("五");
        List<User> users2 = userMapper.findUserByCondition(user);

        System.out.println("sex=男，人数：" + users1.size() + "  username含有五 sex=男,人数：" + users2.size());
    }

    @Test
    public void findUserByIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        ids.add(5);
        List<User> users = userMapper.findUserByIds(ids);

        System.out.println(users.size());
        for (User user : users)
            System.out.println(user.toString());
    }

    @Test
    public void addUser() {

        User user = new User();
        user.setUsername("w五sdgsd");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("fwqfew");

        userMapper.addUser(user);

        sqlSession.commit();
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setId(5);
        user.setUsername("qqwqwqfqw");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("faafafafa");
        userMapper.updateById(user);
        sqlSession.commit();
    }

    @Test
    public void deleteById() {
        userMapper.deleteById(10);
        sqlSession.commit();
    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}

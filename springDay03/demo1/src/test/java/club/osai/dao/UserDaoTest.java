package club.osai.dao;

import club.osai.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
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

        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User userById = userDao.findUserById(1L);
        User userById1 = userDao.findUserById(1L);
        System.out.println(userById);
        System.out.println(userById1);


    }

    @Test
    public void findUserByUsername() {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        List<User> users = userDao.findUserByUsername("明");
        System.out.println(users);
    }

    @Test
    public void addUser() {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = new User();
        user.setSex(1);
        user.setAddress("上海汉得");
        user.setBirthday(new Date());
        user.setUsername("陈权11");
        int i = userDao.addUser(user);
        if (i > 0) {

            System.out.println(user);
        }
    }
}
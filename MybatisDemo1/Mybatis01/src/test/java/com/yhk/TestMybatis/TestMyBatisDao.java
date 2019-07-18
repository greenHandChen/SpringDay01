package com.yhk.TestMybatis;

import com.yhk.Dao.DaoImpl.UserDaoImpl;
import com.yhk.Dao.UserDao;
import com.yhk.Pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatisDao {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public  void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testMyBatisDao(){
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //ID查询
        System.out.println(userDao.findUserById(10));
        //用户名查询
        System.out.println(userDao.fingUserByName("张"));
        //添加用户
        User user =new User();
        user.setUsername("mybatis.dao");
        user.setAddress("安徽");
        System.out.println(userDao.addUser(user));
    }
}

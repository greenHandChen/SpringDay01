package com.hand.user;

import com.hand.dao.UserDaoImpl;
import com.hand.entity.User;
import com.hand.entity.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;


/**
 * Created by HuangHeng on 2019/7/18
 */
public class TestWeb2 {

    private SqlSessionFactory sqlSessionFactory =null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    /**
     * @author:  HuangHeng
     * @description  根据用户id查询用户信息
     * @CreateDate:  2019/7/18
     */
    @Test
    public void findUserById() throws IOException {
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(54));
        System.out.println(userDao.findUserByUsername("%H%"));
        User user=new User();
        user.setSex("M");
        user.setAddress("湖北孝感");
        user.setUsername("CRS");
        System.out.println(userDao.addUser(user));
    }

}

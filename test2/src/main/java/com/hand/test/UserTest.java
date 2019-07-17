package com.hand.test;

import com.hand.a_damain.User;
import com.hand.c_hikari.UserDaoForJdbcDaoSupport;
import com.hand.c_hikari.UserDaoForJdbcTemplate;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/17
 */
public class UserTest {

    private ApplicationContext applicationContext=null;
    private UserDaoForJdbcTemplate userDaoForJdbcTemplate =null;

    private UserDaoForJdbcDaoSupport userDaoForJdbcDaoSupport=null;
    /**
     * @author:  HuangHeng
     * @description 测试前加载初始化applicationContext
     * @CreateDate:  2019/7/17
     */
    @Before
    public void getApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        userDaoForJdbcTemplate = applicationContext.getBean("userDaoForJdbcTemplate", UserDaoForJdbcTemplate.class);
        userDaoForJdbcDaoSupport= applicationContext.getBean("userDaoForJdbcDaoSupport", UserDaoForJdbcDaoSupport.class);
    }

    /**
     * @author:  HuangHeng
     * @description  修改用户数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testInsertUser(){
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        //UserDaoForJdbcTemplate userDaoForJdbcTemplate = applicationContext.getBean("userDao", UserDaoForJdbcTemplate.class);
        System.out.println("修改用户数据-->"+ userDaoForJdbcTemplate.updatetUser(new User(5L, "HJ", "123")));
    }

    /**
     * @author:  HuangHeng
     * @description  根据用户id删除用户数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testDeleteUser(){
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context.xml");
        //UserDaoForJdbcTemplate userDaoForJdbcTemplate = applicationContext.getBean("userDao", UserDaoForJdbcTemplate.class);
        System.out.println("删除记录-->"+ userDaoForJdbcTemplate.deleteUser(new User(2L, "HJ", "123")));
    }

    /**
     * @author:  HuangHeng
     * @description  无条件查询所有用户数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testQueryALlUser(){
        //UserDaoForJdbcTemplate userDaoForJdbcTemplate = applicationContext.getBean("userDao", UserDaoForJdbcTemplate.class);
        List<User> user = userDaoForJdbcTemplate.getUser();
        System.out.println("查询所有数据-->"+user);
    }

    /**
     * @author:  HuangHeng
     * @description  根据用户查询用户数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testQueryALlUserByID(){
        //UserDaoForJdbcTemplate userDaoForJdbcTemplate = applicationContext.getBean("userDao", UserDaoForJdbcTemplate.class);
        List<User> user = userDaoForJdbcTemplate.getUserAllById(new User(3L,null,null));
        System.out.println("根据id查询用户数据-->"+user);
    }

    /**
     * @author:  HuangHeng
     * @description  插入用户数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void insertUser(){
        //UserDaoForJdbcTemplate userDaoForJdbcTemplate = applicationContext.getBean("userDao", UserDaoForJdbcTemplate.class);
        System.out.println("插入用户记录-->"+
                userDaoForJdbcTemplate.insertUser(new User(null,"haxihaxi","bilibili")));
    }

    /**
     * @author:  HuangHeng
     * @description  继承 JdbcDaoSupport 对用户数据进行操作
     *               select
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testDaoForJdbcDaoSupport(){
        System.out.println("查询所有用户数据-->"+userDaoForJdbcDaoSupport.getUser());;
    }
}

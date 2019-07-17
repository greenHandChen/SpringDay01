package com.lx.springtest;

import com.lx.springtest.Dao.UserDao;
import com.lx.springtest.Dao.UserDao_two;
import com.lx.springtest.Entity.User;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class testApi {
    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hand?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"张三","123456");
    }

    //配置hikari连接池测试
    @Test
    public void morning(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("datasource.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        userDao.update(user);
    }

    //配置druid连接池测试
    @Test
    public void morning_two(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("druid_datasource.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        userDao.update(user);
    }

    //通过配置文件加入数据源
    @Test
    public void morning_three(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("druid_datasource_two.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("张三");
        user.setPassword("333");
        userDao.update(user);
    }

    //JdbcDaoSupport测试
    @Test
    public void morning_four(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcDaoSupport_datasource.xml");
        UserDao_two userDao_two = (UserDao_two) applicationContext.getBean("userDao_two");
//        User user = new User();
//        user.setUsername("张三");
//        user.setPassword("444");
//        userDao_two.update(user);

        User user = new User();
        user.setId(2);
        System.out.println(userDao_two.getUserById(user));

        System.out.println(userDao_two.getUsers());
    }


}

package com.yts.api;

import com.yts.beans.User;
import com.yts.dao.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestApi {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into sys_user (username,password) values (?,?)";
        jdbcTemplate.update(sql,"hikar","123qwe");

    }

    @Test
    public void testDel(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(3L);
        userDao.delete(user);
    }

    @Test
    public void testUpd(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(4L);
        user.setUsername("hell");
        user.setPassword("ddeeeqq");
        userDao.update(user);
    }

    @Test
    public void testQueryById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(4L);
        User userById = userDao.findUserById(user);
        System.out.println(userById);
    }

    @Test
    public void testQueryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        List<User> allUsers = userDao.findAllUsers();
        System.out.println(allUsers);
    }
}

package com.hand.zhang.test;

import com.hand.zhang.dao.UserDao;
import com.hand.zhang.pojo.User;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TestJdbc
 * Author:ZhangChunjia
 * Date:2019/7/17 8:50
 */
public class TestJdbc {

    @Test
    public void testHikari(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/t_user1?useSSL=false&serverTimezone=UTC&characterEncoding=utf-8");
        hikariDataSource.setUsername("zhang");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSQL="insert into user1(id,name,pwd) values(?,?,?);";
        jdbcTemplate.update(insertSQL,"23","lifsdfd","123");
    }

    @Test
    public void demo01(){
        List<User> list=new ArrayList<User>();
        ApplicationContext context=new ClassPathXmlApplicationContext("conf/spring-jdbc.xml");
        UserDao userDao=context.getBean("userDao",UserDao.class);
        //User user=(User) context.getBean("user");
        list=userDao.getUsers();
        //user=userDao.getUserById(user);

        //System.out.println(user);

        for (User u : list) {
            System.out.println(u.toString());
        }

    }
}

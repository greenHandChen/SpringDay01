package com.hand.TestJDBC;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJ {
    @Test
    public void testApi() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql, "yz1997", 123457);
}

    @Test
    public void testDao1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(2L);
        user.setUsername("yanzhen1");
        user.setPassword("12345678");
        userDao.update(user);
    }

    @Test
    public void testDao2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(2L);
        userDao.update(user);
    }
    @Test
    public void testDao3(){
       ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
       UserDao1 userDao1=applicationContext.getBean("userDao1",UserDao1.class);
       User user=new User();
       user.setId(2L);
       user.setUsername("yanzhen1");
       user.setPassword("12345678");
       userDao1.update(user);
    }
    @Test
    public void testDao4(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao1 userDao1=applicationContext.getBean("userDao1",UserDao1.class);
        User user=new User();
        user.setId(2L);
        System.out.println(userDao1.getUserById(user));
    }
    @Test
    public void testDao5(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao1 userDao1=applicationContext.getBean("userDao1",UserDao1.class);
        User user=new User();
        System.out.println(userDao1.getUsers(user));
    }
}

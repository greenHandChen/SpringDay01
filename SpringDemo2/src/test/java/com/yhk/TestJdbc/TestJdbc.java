package com.yhk.TestJdbc;

import com.yhk.Pojo.User;
//import com.yhk.Spring.g_query.UserDao;
import com.yhk.Pojo.User2;
import com.yhk.Spring.f_jdbcSupport.UserDao;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbc {



    public void testApl(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) value (?,?);";
        jdbcTemplate.update(insertSql,"yanghongkunTest1","25580"); //添加用户
    }


    public  void demo1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User u=new User();
        u.setId(3);
        u.setUsername("yhkdemo1up");
        u.setPassword("25580");
        System.out.println(u.toString());
//        userDao.upUser(u); //修改用户
    }


    public void demo2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User u=new User();
        u.setId(4);
//        userDao.delete(u); //删除用户
    }


    public void demo3JdbcDaoSupport(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User u=new User();
        u.setId(3);
        u.setUsername("yhkdemo3sup");
        u.setPassword("25580");
        System.out.println(u.toString());
        userDao.update(u); //修改用户
    }

    @Test
    public void demo4GetUserById(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User2 u2=new User2();
        u2.setId((long)3);
        System.out.println(userDao.GetUserById(u2).getId());
        System.out.println(userDao.GetUserById(u2).getUsername());
        System.out.println(userDao.GetUserById(u2).getPassword());//查询
    }
    @Test
    public void demo5GetAllUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao.getAllUser().toString());
    }

}

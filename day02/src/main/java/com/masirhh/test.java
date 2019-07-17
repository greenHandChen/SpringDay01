package com.masirhh;

import com.masirhh.beans.UserBean;
import com.masirhh.dao.UserDao;
import com.masirhh.dao.UserDao1;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class test {

    @Test
    public void test1() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/java_web?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false&zeroDateTimeBehavior=convertToNull");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(sql, "mybaits", "123456");
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcSettings.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        UserBean userBean = new UserBean();
        userBean.setId(1L);
        userBean.setUsername("2211");
        userBean.setPassword("Java1211");
        userDao.update(userBean);
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcSettings.xml");
        UserDao1 userDao = applicationContext.getBean(UserDao1.class);
        UserBean userBean = new UserBean();
        userBean.setId(4L);
        userDao.deleteuser(userBean);
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcSettings.xml");
        UserDao1 userDao = applicationContext.getBean(UserDao1.class);
        UserBean userBean = new UserBean();
        userBean.setId(1L);
        System.out.println(userDao.getUserById(userBean).toString());
    }

    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcSettings.xml");
        UserDao1 userDao = applicationContext.getBean(UserDao1.class);
        List<UserBean> s = userDao.getUsers();
        for (UserBean ss : s) {
            System.out.println(ss.toString());
        }

    }


}

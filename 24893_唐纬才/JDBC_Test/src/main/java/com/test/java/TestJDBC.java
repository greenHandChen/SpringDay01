package com.test.java;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {

    @Test
    public void testAPi()
    {
        //方法一：直接在代码中对hikarDataSource数据源进行配置
        /*HikariDataSource hikarDatasource = new HikariDataSource();
        hikarDatasource.setDriverClassName("com.mysql.jdbc.Driver");
        hikarDatasource.setJdbcUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikarDatasource.setUsername("root");
        hikarDatasource.setPassword("386409");*/
        //方法二：才用Beans容器和仓库配置hikarDataSource数据源（使用properties文件配置）
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HikariDataSource hikarDatasource=context.getBean("dataSource",HikariDataSource.class);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikarDatasource);
        String insertSql="insert into user(id,name,sex)values(?,?,?);";
        jdbcTemplate.update(insertSql,null,"毛不易","男");*/
        //方法三：在XML文件中配置Druid数据源对数据库数据进行操作（使用properties文件配置）
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userdao",UserDao.class);
        User user=new User();
        user.setId(2);
        user.setName("yoona");
        user.setSex("女");
        userDao.update(user);
    }

}
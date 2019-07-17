package com.xyl.spring.a_domain;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 使用jdbcTemplate插入两条数据,采用Hikari数据源
 */
public class TestJdbc{
    @Test
    public  void testApi{
        HikariDataSource hikariDataSource =new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate =new JdbcTemplate(hikariDataSource);
        String insertSQl="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSQl,"hikari","123456");
    }
}

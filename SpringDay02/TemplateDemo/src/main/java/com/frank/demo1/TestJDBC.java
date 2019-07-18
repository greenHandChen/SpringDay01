package com.frank.demo1;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
    @Test
    public void testAPI(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String insertSql = "insert into sys_user(username,password) value(?,?)";
        jdbcTemplate.update(insertSql,"张三","123456");
    }
}

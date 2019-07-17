package com.sise.spring.b_api;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db_mysise?useUnicode=true");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("hgt123456");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,"hikari","123456");

    }
}

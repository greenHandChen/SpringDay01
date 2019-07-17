package com.spring.b_api;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
    @Test
    public void test(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?userUnicode=true&characterEncoding=utf-8&userSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("dragon");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,"testHikariCP","123456");
    }
}

package com.java.web.spring.b_spi;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("liucanlie.123");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"hikari","9233455");
    }


}

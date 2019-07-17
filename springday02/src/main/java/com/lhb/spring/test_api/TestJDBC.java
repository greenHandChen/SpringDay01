package com.lhb.spring.test_api;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created By LHB on 2019/7/17;
 */
public class TestJDBC {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String sql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(sql,"hikari","123456");
    }
}

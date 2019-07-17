package com.hand.sysmanager.spring.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 9:18
 */
public class TestApi {

    @Test
    public void testApi()
    {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSl=false");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String inserSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(inserSql,"hikari","1234");



    }
}

package com.wzh.dao;


import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class TESTJDBC {
    @Test
    public void testApi() {
        HikariDataSource hikariDataSource = new HikariDataSource();

        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values('11','11');";
        jdbcTemplate.update(insertSql);
    }
}

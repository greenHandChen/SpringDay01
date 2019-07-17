package com.ljx.springday02.test;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 15:03
 */
public class JDBCTest {

    /**
     *功能描述  配置JDBC模版时,注入数据源,我们采用Hikari数据源
     * @author LJX
     * @date 2019/7/17 15:10
     * @param  * @param
     * @return void
     */
    @Test
    public void testAPI(){
        HikariDataSource hikariDataSource  = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into user(username,password) values (?,?)";
        jdbcTemplate.update(sql, "ljx", "666666");

    }
}

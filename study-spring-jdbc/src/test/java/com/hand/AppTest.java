package com.hand;

import static org.junit.Assert.assertTrue;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // 使用jdbcTemplate配置数据库连接
    @Test
    public void testApi() {

        HikariDataSource hikariDataSource = new HikariDataSource();

        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("12345678");

         JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);

         jdbcTemplate.update("INSERT INTO `sys_user` VALUE (4, '25573', '25573')");

    }

    // 使用配置文件配置数据源 - Hikari
    // 使用配置文件配置数据源 - Druid
}

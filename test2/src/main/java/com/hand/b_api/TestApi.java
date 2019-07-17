package com.hand.b_api;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by HuangHeng on 2019/7/17
 */
public class TestApi {
    /**
     * @author:  HuangHeng
     * @description  测试连接数据库并插入数据
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testApi(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://39.105.125.176:3306/java_web?useSSL=false&serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("HH123");

        try {
            JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
            String sql="INSERT INTO sys_user(username,password) values(?,?);";
            jdbcTemplate.update(sql,"def","abc");
            System.out.println("插入成功");
        }catch (Exception e){
            System.out.println("插入失败--->"+e.getMessage());
        }

    }
}

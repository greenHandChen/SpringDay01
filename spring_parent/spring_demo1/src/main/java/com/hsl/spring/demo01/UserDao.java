package com.hsl.spring.demo01;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

   @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test

    public void InsertUser(){

        String sql = "delete from spring_u where uId = 1 ";
        System.out.println(jdbcTemplate);
        jdbcTemplate.update(sql);
    }
    public void FindIdByUser(){

            String name = jdbcTemplate.queryForObject("select name from spring_u where id = ?", String.class, 1);
            System.out.println(name);

    }
//    @Test
    // 删除操作
//    public void demo3(){
//        String sql= "select * from spring_u where id = 1";
//        jdbcTemplate.query(new Class[]{String.class}, sql);
//    }





}

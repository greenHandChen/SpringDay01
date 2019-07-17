package org.hgh.test;

import com.zaxxer.hikari.HikariDataSource;
import org.hgh.demo.pojo.User;
import org.hgh.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJDBC {
    @Autowired
    private IUserService iUserService;

    @Test
    public void testAPI(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&userSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into sys_user(username,password)values (?,?);";
        jdbcTemplate.update(sql,"王五","555555");

        String sql1 = "insert into sys_user(username, password) values(?,null)";
        jdbcTemplate.update(sql1,"小丽");

        String sql2 = "update customers set name = ? where id = ?";
        jdbcTemplate.update(sql,"张三",1);

        String sql3 = "delete from sys_user where id = ?";
        jdbcTemplate.update(sql3,3);
    }


    @Test
    public void TestSupport(){
        User user = new User(1L,"赵六","656565");
        iUserService.UpdateUser(user);
    }




}

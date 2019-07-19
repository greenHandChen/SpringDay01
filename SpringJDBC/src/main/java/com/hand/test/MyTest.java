package com.hand.test;

import com.hand.bean.User;
import com.hand.service.IUserService;
import com.hand.service.impl.UserServiceImpl;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyTest {
    private IUserService userService;

    public MyTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = context.getBean(UserServiceImpl.class);
    }

    @Test
    public void test01() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(sql, "hikari", "123456");
    }

    @Test
    public void test02() {
        User user = new User("fandelu", 120);
        userService.addUser(user);
    }

    @Test
    public void test03() {
        System.out.println(userService.getAllUser());
    }

    @Test
    public void test04(){
        System.out.println(userService.getUserById(2));
    }
}

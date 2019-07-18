package test01;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbc {
    @Test
    public  void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSl=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        //调用spring-jdbc
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"dingwensheng","123456");
    }
}

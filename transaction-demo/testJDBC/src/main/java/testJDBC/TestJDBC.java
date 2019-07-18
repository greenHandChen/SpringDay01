package testJDBC;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {

    @Test
    public void testApi(){

        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql = "insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"hikari1","654321");


    }
}

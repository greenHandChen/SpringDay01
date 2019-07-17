package Softeem.Test;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {

    @Test
    public  void  testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/softeem?useUnicode=true&characterEncoding=utf-8&&useSSL=false&serverTimezone=UTC");
        hikariDataSource.setPassword("123456");
        hikariDataSource.setUsername("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into User(name,password) values(?,?)";
        jdbcTemplate.update(sql,"老高","123456");





    }

}

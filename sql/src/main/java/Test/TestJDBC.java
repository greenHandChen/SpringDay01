package Test;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {

    @Test
    public void testApi(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hand?serverTimezone=UTC");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?)";
        jdbcTemplate.update(insertSql,"hikari","123456");
    }
}

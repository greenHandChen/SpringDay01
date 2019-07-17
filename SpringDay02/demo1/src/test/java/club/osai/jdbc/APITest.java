package club.osai.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class APITest {
    @Test
    public void API() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("13882");


        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        String sql = "insert into sys_user (username,password) values(?,?)";
        jdbcTemplate.update(sql, "zero", "13882");
    }


}

import com.zaxxer.hikari.HikariDataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJJDBC {
    @Test
    public void testApi(){
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate=new JdbcTemplate(hikariDataSource);
        String insertSql="insert into sys_user(username,password) values(?,?);";
        jdbcTemplate.update(insertSql,"kikari",123456);
    }

    }


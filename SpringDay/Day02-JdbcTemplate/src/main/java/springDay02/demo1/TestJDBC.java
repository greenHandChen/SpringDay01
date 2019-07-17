package springDay02.demo1;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class TestJDBC {
    @Test
    public void testApi(){
        // 数据源
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
//        String insertSQL = "insert into sys_user(username,password) values(?,?)";
//        jdbcTemplate.update(insertSQL, "wangjie","123456");

        // 如何插入多条语句？
        //1、可能会有SQL注入的危险
//        String[] sql = new String[2];
//        sql[0] = "insert into sys_user(username,password) values('fourth01','123456');";
//        sql[1] = "insert into sys_user(username,password) values('fourth02','123456');";
//        jdbcTemplate.batchUpdate(sql);

        //2、在同一个事务下执行多条语句
        /*
        * 同样有SQL注入的危险
        * */
//        Object result = jdbcTemplate.execute((Statement stmt) -> {
//            String sql1 = "insert into sys_user(username,password) values('fourth01','123456');";
//            boolean result1 = stmt.execute(sql1);
//
//            String sql2 = "insert into sys_user(username,password) values('fourth01','123456');";
//            boolean result2 = stmt.execute(sql2);
//
//            return 1;
//        });

        // 3、在同一个事务下执行多条语句
        Integer execute = jdbcTemplate.execute((Connection conn) -> {
            String sql1 = "insert into sys_user(username,password) values(?,?);";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, "admin01");
            ps1.setString(2, "admin01");
            int i1 = ps1.executeUpdate();

            String sql2 = "insert into sys_user(username,password) values(?,?);";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setString(1, "admin01");
            ps2.setString(2, "admin01");
            int i2 = ps2.executeUpdate();

            return 1;
        });


        // 使用Spring简化
        // 数据源的Bean、JdbcTemplate都应该不需要我们去创建。交给IOC容器 ==> demo2
    }
}

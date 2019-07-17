package springDay02.demo1;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class SelectDemo {

    private JdbcTemplate initJdbcTemplate(){
        // 数据源
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);

        return jdbcTemplate;
    }

    // 聚合函数示例
    @Test
    public void select01(){
        String countSql = "select count(*) from sys_user;";
        Integer c = initJdbcTemplate().queryForObject(countSql, null, Integer.class);
        System.out.println(c);
    }

    // 条件查询示例
    @Test
    public void select02(){
        String countSql = "select username from sys_user u where u.id = ?";
        Object[] objects = {5L};
        String rst =  initJdbcTemplate().queryForObject(countSql, objects, String.class);
        System.out.println(rst);
    }

    // 查询单个User对象
    @Test
    public void select03(){
        User user = new User();
        user.setId(8L);

        String querySQL = "select * from sys_user where id = ?";
        Object[] objects = {user.getId()};
        User user1 = initJdbcTemplate().queryForObject(querySQL, new User(), objects);
        System.out.println(user1.toString());
    }

    // 查询User对象的List集合
    @Test
    public void select04(){
        String sql = "select * from sys_user";
        List<User> query = initJdbcTemplate().query(sql, new User());
        System.out.println(query.toString());
    }


}

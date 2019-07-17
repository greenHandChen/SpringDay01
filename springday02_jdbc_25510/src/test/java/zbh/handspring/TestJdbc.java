package zbh.handspring;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: wuhui
 * @time: 2019/7/17 9:00
 * @desc:
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class TestJdbc {
    
    @Test
    public void test01(){
        HikariDataSource hi=new HikariDataSource();
        hi.setUsername("root");
        hi.setPassword("admin");
        hi.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useSSL=false&characterEncoding=UTF-8");
        hi.setDriverClassName("com.mysql.jdbc.Driver");

        JdbcTemplate template=new JdbcTemplate(hi);
        String sql="insert into sys_user (username,password) values('111','111')";
        template.update(sql);
    }
}

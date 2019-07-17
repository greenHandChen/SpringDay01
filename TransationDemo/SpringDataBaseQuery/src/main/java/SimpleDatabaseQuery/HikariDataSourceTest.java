package SimpleDatabaseQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HikariDataSourceTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;  //自动注入jdbcTemplate 即使吧 Hikari数据源引入;

    public int updata(User user){
        String updatesql= "update sys_user set username=?,password=? where id = ?";
        int up_flag = jdbcTemplate.update(updatesql,user.getUsername(),user.getPassword(),user.getId());
        return up_flag;
    }

    public int deleteByID(int id){
        String deleSql = "delete from sys_user where id = ?";
        int del_flag = jdbcTemplate.update(deleSql,id);
        return del_flag;
    }
}

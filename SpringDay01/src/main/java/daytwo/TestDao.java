package daytwo;

public class TestDao extends JdbcDaoSupport {
    public void update(User user) {
        String updateSql = "update sys_user u set u.username=？,u.password=? where u.id=?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }
    public void delete(User user){
        String deleteSql="delete from sys_user where id=?";
        getJdbcTemplate().update(deleteSql,user.getId());
    }
    }
}

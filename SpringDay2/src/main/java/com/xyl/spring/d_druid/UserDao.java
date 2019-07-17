package com.xyl.spring.d_druid;

@Repository(value = "druidUserDao")
public class UserDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public int update(){
        String updateSql="update sys_user u set u.username=? where u.id=?";
        return jdbcTemplate.update(updateSql,"hikariUpdate",3);
    }
    public int delete(){
        String deleteSql="DELETE FROM sys_user where id=?";
        return jdbcTemplate.update(deleteSql,3);
    }
    public int insert(){
        String insertSql="insert into sys_user values('3','durid','123456')";
        return jdbcTemplate.update(insertSql);
    }
}
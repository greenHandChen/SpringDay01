package com.xyl.spring.f_jdbcDaoSupport;

public class JdbcDaoSupport {
    public int update(){
        String updateSql="update sys_user u set u.username=? where u.id=?";
        return getJdbcTemplate().update(updateSql,3);
    }
    public int delete(){
        String deleteSql="DELETE FROM sys_user where id=?";
        return getJdbcTemplate().update(deleteSql,3);
    }
    public int insert(){
        String insertSql="insert into sys_user values('3','hikariInsert','123456')";
        return getJdbcTemplate().update(insertSql);
    }

}

package Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements  IAccountDao {

    public void in(String inner, Double money) {
        String sql="update account a set a.money=money+? where a.username=?";
        super.getJdbcTemplate().update(sql,money,inner);
    }

    public void out(String outer, Double money) {
        String sql="update account a set a.money=money-? where a.username=?";
        super.getJdbcTemplate().update(sql,money,outer);
    }
}
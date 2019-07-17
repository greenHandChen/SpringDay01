package dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements  IAccountDao {
    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?",money,inner);
    }

    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?",money,outer);
    }
}

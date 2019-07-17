package com.yhk.transcation.DaoImpl;

import com.yhk.transcation.Dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void in(String inner, double money) {
        String sql="update account t set t.money=t.money + ? where t.username = ?";
        getJdbcTemplate().update(sql,money,inner);
    }

    @Override
    public void out(String outer, double money) {
        String sql="update account t set t.money=t.money - ? where t.username = ?";
        getJdbcTemplate().update(sql,money,outer);
    }
}

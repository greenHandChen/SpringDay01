package Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void in(String inner, BigDecimal money) {
        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?", money, inner);
    }

    @Override
    public void out(String outer, BigDecimal money) {
        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?", money, outer);
    }
}

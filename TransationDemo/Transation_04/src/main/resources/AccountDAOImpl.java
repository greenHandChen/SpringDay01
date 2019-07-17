package Transation.TransationDAO;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {

    public void in(String inner, BigDecimal money){
        String insql = "update account a set a.money = a.money + ? where a.username = ?";
        super.getJdbcTemplate().update(insql,money,inner);
    }

    public void out(String outer, BigDecimal money){
        String ousql = "update account a set a.money = a.money - ? where a.username = ?";
        super.getJdbcTemplate().update(ousql,money,outer);
    }
}

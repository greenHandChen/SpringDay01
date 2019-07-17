package TransferCase.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void in(String inner, Double money) {

        String sql = "UPDATE `account` a SET `a`.`money` = `a`.`money` + ? WHERE `a`.`username` = ?;";

        getJdbcTemplate().update(sql, money, inner);

    }

    @Override
    public void out(String outer, Double money) {

        String sql = "UPDATE `account` a SET `a`.`money` = `a`.`money` - ? WHERE `a`.`username` = ?;";

        getJdbcTemplate().update(sql, money, outer);


    }
}

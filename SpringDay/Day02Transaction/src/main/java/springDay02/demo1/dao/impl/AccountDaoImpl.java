package springDay02.demo1.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import springDay02.demo1.dao.IAccountDao;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Override
    public void out(String outer, Double money) {
        String sql = "update account set money = money - ? where username = ?";

        getJdbcTemplate().update(sql, money, outer);
    }

    @Override
    public void in(String inner, Double money) {
        String sql = "update account set money = money + ? where username = ?";

        getJdbcTemplate().update(sql, money, inner);
    }
}

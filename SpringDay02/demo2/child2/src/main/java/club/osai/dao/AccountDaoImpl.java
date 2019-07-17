package club.osai.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccountDaoImpl.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void in(String inner, Double money) {

        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username=?", money, inner);


    }

    @Override
    public void out(String outer, Double money) {

        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username=?", money, outer);

    }
}


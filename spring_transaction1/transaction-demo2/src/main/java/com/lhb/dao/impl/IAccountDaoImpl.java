package com.lhb.dao.impl;

import com.lhb.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created By LHB on 2019/7/17;
 */
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    /**
     * 转出
     * @param outer
     * @param money
     */
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account set money=money - ? where username = ?",money,outer);
    }

    /**
     *转入
     * @param inner
     * @param money
     */
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account set money=money + ? where username = ?",money,inner);
    }
}

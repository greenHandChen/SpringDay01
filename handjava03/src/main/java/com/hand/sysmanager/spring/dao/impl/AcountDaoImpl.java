package com.hand.sysmanager.spring.dao.impl;

import com.hand.sysmanager.spring.dao.IAcountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 14:43
 */
@Repository("acountDaoImpl")
public class AcountDaoImpl extends JdbcDaoSupport implements IAcountDao {
    public void outMoney(String outer, BigDecimal money) {
        getJdbcTemplate().update("update account set money = money - ? where username = ?",money,outer);
    }

    public void inMoney(String inner, BigDecimal money) {
         int update = getJdbcTemplate().update("update account set money = money + ? where username = ?", money, inner);

    }
}

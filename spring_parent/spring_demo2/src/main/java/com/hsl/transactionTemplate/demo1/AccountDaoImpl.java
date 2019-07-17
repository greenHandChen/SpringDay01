package com.hsl.transactionTemplate.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



public class AccountDaoImpl  extends JdbcDaoSupport implements AccountDao  {

    public void InMoney(String name, double money) {

       String  sql =  "update spring_u set money = money - ? where name = ?";
        this.getJdbcTemplate().update( sql,money,name);
    }

    public void OutMoney(String name, double money) {
        String  sql =  "update spring_u set money = money + ? where name = ?";
        this.getJdbcTemplate().update( sql,money,name);
    }




}

package com.zt.demo.dao;

import java.math.BigDecimal;

public interface IAccountDao {

    //转入
    void in(String inner, BigDecimal money);

    //转出
    void out(String out, BigDecimal money);
}

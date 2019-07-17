package com.Dao;

import java.math.BigDecimal;

public interface IAccountDao {

    public void in(String inner, Integer money);

    public void out(String outer,Integer money);
}

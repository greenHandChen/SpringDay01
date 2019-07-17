package com.masirhh.dao;

import java.math.BigDecimal;

public interface AccountDao {
    public void in(String inner, BigDecimal money);
    public void out(String outer,BigDecimal money);

    ;
}

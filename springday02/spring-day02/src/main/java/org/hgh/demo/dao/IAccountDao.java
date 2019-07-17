package org.hgh.demo.dao;

import java.math.BigDecimal;

public interface IAccountDao {
    void in(String inner, BigDecimal money);

    void out(String outer, BigDecimal money);
}

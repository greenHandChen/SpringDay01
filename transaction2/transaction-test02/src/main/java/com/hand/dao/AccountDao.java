package com.hand.dao;

import java.math.BigDecimal;

public interface AccountDao {

    void in(String account, BigDecimal money);

    void out(String account, BigDecimal money);

}

package Dao;

import java.math.BigDecimal;

public interface AccountDao {
    void in(String inner, BigDecimal money);
    void out(String outer, BigDecimal money);
}

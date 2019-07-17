package Transation.TransationDAO;

import java.math.BigDecimal;


public interface IAccountDAO {
    void in(String inner, BigDecimal money);
    void out(String outer, BigDecimal money);
}

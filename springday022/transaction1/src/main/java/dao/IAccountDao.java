package dao;

import java.math.BigDecimal;

public interface IAccountDao {
    public void in(String inner, Double money);
    public void out(String outer,Double moeny);
}

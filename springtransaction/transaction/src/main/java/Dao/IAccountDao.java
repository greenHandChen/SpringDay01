package Dao;

import java.math.BigDecimal;

public interface IAccountDao {

    public void in(String inner, BigDecimal money);

    public void out(String outer,BigDecimal money);


}

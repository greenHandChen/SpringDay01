package Service;

import java.math.BigDecimal;

public interface IAccountService {

    public void transfer(String outer, String inner, BigDecimal money);
}

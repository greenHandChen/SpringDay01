package Service;

import java.math.BigDecimal;

public interface AccountService {
    void transfer(String outer, String inner, BigDecimal money);
}

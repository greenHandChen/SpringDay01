package Transaction.Service;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/17 16:24
 * @Version: V1.0
 **/
public interface IAcountService {
    void transfer(String outer, String inter, BigDecimal money);
}

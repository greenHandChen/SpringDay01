package Transaction.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/17 14:55
 * @Version: V1.0
 **/
public interface IAccountDao {

    int out(String outer, BigDecimal money);

    int in(String inter, BigDecimal money);
}

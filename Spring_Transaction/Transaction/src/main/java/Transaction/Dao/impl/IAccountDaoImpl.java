package Transaction.Dao.impl;

import Transaction.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/17 14:56
 * @Version: V1.0
 **/
@Repository
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    /**
    * @Description: 转出方法
    * @Author: TanLinQuan
    * @Date: 2019/7/17 15:41
    * @params: [outer, money]
    * @return: int
    **/
    public int out(String outer, BigDecimal money) {
        String outMoneySql = "update account t set t.money = t.money - ? where t.username = ?;";
        return getJdbcTemplate().update(outMoneySql,money,outer);
    }

    /**
    * @Description: 转入方法
    * @Author: TanLinQuan
    * @Date: 2019/7/17 15:41
    * @params: [outer, money]
    * @return: int
    **/
    public int in(String inter, BigDecimal money) {
        String inMoneySql = "update account t set t.money = t.money + ? where t.username = ?;";
        return getJdbcTemplate().update(inMoneySql,money,inter);
    }



}

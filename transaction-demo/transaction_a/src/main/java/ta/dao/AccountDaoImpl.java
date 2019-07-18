package ta.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    /**
      * @Author: MikeLv
      * @Description: 转出
      * @Date: 2019/7/17 18:20
      */
    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?",money,outer);
    }

    /**
      * @Author: MikeLv
      * @Description: 转入
      * @Date: 2019/7/17 18:21
      */
    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?",money,inner);
    }
}

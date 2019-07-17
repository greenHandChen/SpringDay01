package zbh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author: wuhui
 * @time: 2019/7/17 11:16
 * @desc:
 */
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Qualifier("druidDataSource")
    @Autowired
    DataSource dataSource;

    @Autowired
    public void setDataSource(){
        super.setDataSource(dataSource);
    }
    @Override
    public void out(String outer, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money-? where t.username=?",money,outer);
    }

    @Override
    public void in(String inner, Double money) {
        getJdbcTemplate().update("update account t set t.money=t.money+? where t.username=?",money,inner);
    }
}

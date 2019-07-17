package Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.math.BigDecimal;

@Component
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    //用注解将Datasource注入到AccountDaoImpl
    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void init(){
        setDataSource(dataSource);
    }

    public void in(String inner, BigDecimal money) {
        getJdbcTemplate().update("update accout t set t.money=t.money + ? where t.username=?;",money,inner);

    }

    public void out(String outer, BigDecimal money) {
        getJdbcTemplate().update("update accout t set t.money=t.money - ? where t.username=?;",money,outer);

    }
}

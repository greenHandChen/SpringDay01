package huanglehao.study.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{

    @Override
    public void in(String inner, int money) {
       // System.out.println(getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?;",money,inner));
       /* String sql="select username from account u where u.id =?";
        Object[]objects={1};
        String userName=getJdbcTemplate().queryForObject(sql,objects,String.class);
        System.out.println(userName);*/
        System.out.println(getJdbcTemplate().update("update account t set t.money = t.money + ? where t.username = ?",money,inner));
    }

    @Override
    public void out(String outer, int money) {
        System.out.println(getJdbcTemplate().update("update account t set t.money = t.money - ? where t.username = ?",money,outer));

    }
}

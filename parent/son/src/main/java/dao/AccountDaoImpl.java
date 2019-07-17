package dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Author xiongyilin
 * @Date 2019/7/17 22:58
 * @Version 1.0
 */

@Repository(value = "accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public void in(String inner, Double money) {
        int n = getJdbcTemplate().update("update account t set t.money=t.money+? where t.name=?",money,inner);
        if(n>=1){
            System.out.println("转入到："+inner+"成功");
        }else{
            System.out.println("转入到："+inner+"失败");
        }
    }

    public void out(String outer, Double money) {
        int n = getJdbcTemplate().update("update account t set t.money=t.money-? where t.name=?",money,outer);
        if(n>=1){
            System.out.println(outer+"转出成功");
        }else{
            System.out.println(outer+"转出失败");
        }
    }
}
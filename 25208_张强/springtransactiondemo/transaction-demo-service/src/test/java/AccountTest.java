import core.dao.AccountDao;
import entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zq on 2019/7/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class AccountTest {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void selectAccountTest(){
        List<Account> list = accountDao.queryAll(null);
        for (Account account :list) {
            System.out.println(account.getUsername()+"余额"+account.getMoney());
        }
    }
}

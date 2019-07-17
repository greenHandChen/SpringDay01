import org.springframework.transaction.annotation.Transactional;

/**
 * @Author xiongyilin
 * @Date 2019/7/17 23:03
 * @Version 1.0
 */

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
        int number = 1/0;
        accountDao.in(inner,money);
    }

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
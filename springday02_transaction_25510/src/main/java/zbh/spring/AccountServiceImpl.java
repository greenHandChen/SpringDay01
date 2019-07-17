package zbh.spring;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/**
 * @author: wuhui
 * @time: 2019/7/17 11:19
 * @desc:
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;
    @Autowired
    TransactionTemplate txtemplate;

    @Override
    public void transfer(final String outer, final String inner, final Double money) {
        /*txtemplate.execute(TransactionStatus -> {
            accountDao.out(outer, money);
            accountDao.in(inner,money);
            int i=1/0;
            return null;
        });*/
        /*txtemplate.execute(new TransactionCallback<Object>() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                accountDao.out(outer, money);
                int i=1/0;
                accountDao.in(inner,money);
                return  null;
            }
        });*/
        accountDao.out(outer, money);
        int i=1/0;
        accountDao.in(inner,money);
    }
}

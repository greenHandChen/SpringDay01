package Transaction.Service.impl;

import Transaction.Dao.IAccountDao;
import Transaction.Dao.impl.IAccountDaoImpl;
import Transaction.Service.IAcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/17 16:25
 * @Version: V1.0
 **/
@Service
public class IAcountServiceImpl implements IAcountService {

    @Autowired
    private IAccountDao iAccountDao;
//  注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;
    /**
    * @Description: 转账SERVICE方法
    * @Author: TanLinQuan
    * @Date: 2019/7/17 16:55
    * @params: [outer, inter, money]
    * @return: void
    **/
    public void transfer(String outer, String inter, BigDecimal money) {
        transactionTemplate.execute(TransactionStatus -> {
            iAccountDao.out(outer,money);
            int num = 1 / 0;
            iAccountDao.in(inter,money);
            return null;
        });
    }
}

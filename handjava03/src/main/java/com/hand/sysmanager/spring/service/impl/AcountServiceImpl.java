package com.hand.sysmanager.spring.service.impl;

import com.hand.sysmanager.spring.dao.IAcountDao;
import com.hand.sysmanager.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 14:45
 */
@Service("acountServiceImpl")
public class AcountServiceImpl implements IAccountService {
    @Autowired
    private IAcountDao acountDao;

    public IAcountDao getAcountDao() {
        return acountDao;
    }

    public void setAcountDao(IAcountDao acountDao) {
        this.acountDao = acountDao;
    }

    /**
     * @Description: 转账实现
     * @Param: [outer, inner, money]
     * @return: void
     * @Author: LWY
     * @Date: 2019/7/17 14:57
     */
    @Override
    @Transactional
    public void transfer(final String outer, final String inner, final BigDecimal money) {
//       transactionTemplate.execute(TransactionStatus ->{
//           acountDao.outMoney(outer,money);
//          // int i = 1 / 0;
//           acountDao.inMoney(inner,money);
//           return  null;
//       });
        acountDao.outMoney(outer, money);
        int i = 1 / 0;
        acountDao.inMoney(inner, money);
    }
}

package club.osai.service;

import club.osai.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccountServiceImpl.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int i = 1 / 0;
        accountDao.out(outer, money);
    }
}

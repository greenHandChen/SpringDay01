package com.jqh.test;

import com.jqh.service.AccountService;
import com.jqh.util.BeanUtil;
import org.junit.Test;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 10:57
 * @Description: TransactionTest
 */
public class TransactionTest {
    @Test
    public void testTransaction(){
        AccountService service = BeanUtil.getBean(AccountService.class);
        service.transfer("mybatis","hibernate",50.0);
    }
}

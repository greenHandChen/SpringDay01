package com.hand.test;

import com.hand.service.AccountService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by HuangHeng on 2019/7/21
 */
public class TransferMoney {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test(){
        accountService.transfer("aaa","bbb",200d);
    }
}

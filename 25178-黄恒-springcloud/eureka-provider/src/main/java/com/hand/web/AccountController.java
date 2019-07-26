package com.hand.web;

import com.hand.entity.Account;
import com.hand.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/26
 */
@Slf4j
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/get")
    public List<Account> getList(@RequestParam(value = "id",required = false)Integer id){
        List<Account> account = accountService.getAccount(id);
        log.info("get   id---->"+id+"     account---->"+account);
        return account;
    }

    @RequestMapping("/del")
    public Object delList(@RequestParam(value = "id",required = false)Integer id){
        log.info("del   id---->"+id);
        return accountService.delAccount(id);
    }
    @RequestMapping("/post")
    public Object addlList(Account account){
        log.info("account---->"+account);
        return accountService.addAccount(account);
    }
    @RequestMapping("/put")
    public Object updlList(Account account){
        log.info("account---->"+account);
        return accountService.updAccount(account);
    }
}

package com.hand.web;

import com.hand.entity.Account;
import com.hand.feign.AccountFeign;
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
@RequestMapping("/feign")
@RestController
public class AccountController {
    @Autowired
    private AccountFeign accountFeign;

    @RequestMapping("/get")
    public List<Account> getList(@RequestParam(value = "id",required = false)Integer id){
       return accountFeign.getList(id);
    }

    @RequestMapping("/del")
    public Object delList(@RequestParam(value = "id",required = false)Integer id){
        log.info("del   id---->"+id);
        return accountFeign.delList(id);
    }
    @RequestMapping("/post")
    public Object addlList(Account account){
        log.info("account---->"+account);
        return accountFeign.addlList(account);
    }
    @RequestMapping("/put")
    public Object updlList(Account account){
        log.info("account---->"+account);
        return accountFeign.updlList(account);
    }
}

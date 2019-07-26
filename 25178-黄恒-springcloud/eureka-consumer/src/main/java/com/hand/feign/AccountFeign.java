package com.hand.feign;

import com.hand.entity.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/26
 */
@FeignClient("MICROSERVICE-ACCOUNT")
public interface AccountFeign {

    @RequestMapping("/get")
    public List<Account> getList(@RequestParam(value = "id",required = false)Integer id);
    @RequestMapping("/del")
    public Object delList(@RequestParam(value = "id",required = false)Integer id);
    @RequestMapping("/post")
    public Object addlList(Account account);
    @RequestMapping("/put")
    public Object updlList(Account account);
}

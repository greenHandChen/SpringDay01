package com.example.userserver.feign;

import com.example.userserver.po.Ext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ext-server")
public interface ExtFeignService {

    @RequestMapping("/ext/add")
    public String add(@RequestBody Ext ext);

    @RequestMapping("/ext/del")
    public String del(@RequestBody int[] ids);

    @RequestMapping("/ext/sel")
    public String select(@RequestBody Ext ext);

    @RequestMapping("/ext/update")
    public String update(@RequestBody Ext ext);
}

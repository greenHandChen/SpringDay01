package com.lhb.service2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created By LHB on 2019/7/22;
 */
@FeignClient(value = "service")
public interface HelloClient {

    @RequestMapping("/hello")
    public String Hello(@RequestParam("param") String param);
}

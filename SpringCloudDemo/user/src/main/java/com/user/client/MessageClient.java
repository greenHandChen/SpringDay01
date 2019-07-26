package com.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@FeignClient(name ="message")
public interface MessageClient {

    @GetMapping("/message/getMessage")
    public String getMessage();

}

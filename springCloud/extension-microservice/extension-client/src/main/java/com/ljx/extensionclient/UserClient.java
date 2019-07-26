package com.ljx.extensionclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 16:24
 */
@FeignClient(name = "extension-microservice",  fallback = UserClient.UserClientFallBack.class)
public interface UserClient {
    @GetMapping("/index/toUser")
    String toUser();

    @Component
    class UserClientFallBack implements UserClient {
        @Override
        public String toUser() {
            return "服务超时";
        }
    }
}

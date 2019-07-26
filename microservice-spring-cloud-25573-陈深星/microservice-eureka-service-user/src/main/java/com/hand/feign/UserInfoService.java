package com.hand.feign;

import com.hand.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
// 被调用的服务名称
@FeignClient(name = "microservice-eureka-service-user-info")
//@RequestMapping("/user-info")
public interface UserInfoService {

    @RequestMapping("/one/{id}")
    public UserInfo getUserInfoById(@PathVariable(name = "id") Integer id);
}

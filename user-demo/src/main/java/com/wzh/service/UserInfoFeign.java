package com.wzh.service;

import com.wzh.pojo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("userInfo-service")
public interface UserInfoFeign {
    @RequestMapping("/getUserInfo/{id}")
    public UserInfo getUserInfoById(@PathVariable("id") int id);
}

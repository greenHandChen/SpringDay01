package com.hand.service;

import com.hand.pojo.UserDemo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author dingwensheng
 * @description: 调用服务
 * @date 2019/7/2610:56
 */
//@Service
//@FeignClient(value = "spring-cloud-usermanager")
//public interface UserService {
//    @RequestMapping("/queryUsers")
//    public List<UserDemo> queryUserDemos();
//}

/*
调用网关
 */
@Service
@FeignClient(value = "spring-cloud-zuul")
public interface UserService {
    @RequestMapping("/user/queryUsers")
    public List<UserDemo> queryUserDemos();
}
package com.txz.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.txz.consumer.client.UserClient;
import com.txz.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.lang.Integer;
import java.util.List;

@RestController
@RequestMapping("consumer")
@DefaultProperties(defaultFallback = "backQuery")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id) {
        return userClient.queryById(id);
    }

    //    @HystrixCommand(fallbackMethod = "backQuery")
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
//    })
//    @GetMapping("/{id}")
//    @HystrixCommand
//    public String queryById(@PathVariable("id") Integer id) {
//        String url="http://user-service/user/"+id;
//        String u = restTemplate.getForObject(url, String.class);
//        return u;
//    }

    public String backQuery(){
        return "不好意思，服务器忙！";
    }

//    public String backQuery(Integer id){
//        return "不好意思，服务器忙！";
//    }


//    private RibbonLoadBalancerClient client;
//    private DiscoveryClient discoveryClient;

//    @GetMapping("/{id}")
//    public User queryById(@PathVariable("id") Integer id) {
//        //根据服务Id获取实例
////        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        //从实例中取出ip和端口
////        ServiceInstance instance = instances.get(0);
////        String url="http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
////        ServiceInstance choose = client.choose("user-service");
//        String url="http://user-service/user/"+id;
//        User u = restTemplate.getForObject(url, User.class);
//        return u;
//    }
}

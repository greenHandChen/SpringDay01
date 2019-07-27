package com.yhk.microservicesso.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yhk.microservicesso.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsoController {

    @Autowired
    private UserFeign userFeign;
//    private SsoService ssoService;

    /**
     * 登录
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "findUserFallBack")
    @RequestMapping("/login/{id}")
    public String findUser(@PathVariable("id") int id){
        return this.userFeign.findUser(id).toString();
    }

    public  String findUserFallBack(int id){
        return "错误";
    }
//    public String login(@PathVariable("username") String username, @PathVariable("password") String password){
//        System.out.println("login...");
//        User user = ssoService.checkUser(username, password);
//        if (user==null){
//            return "null";
//        }
//            return "ok";
//    }
    @GetMapping("/test")
    public String test(){
        System.out.println("test");
        return userFeign.test();
    }
}

package com.hand.user.controller;

import com.hand.user.dao.UserDao;
import com.hand.user.dao.UserMapper;
import com.hand.user.entity.Country;
import com.hand.user.entity.User;
import com.hand.user.feign.FeignService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
@MapperScan("com.hand.user.dao")
public class UserController {
    @Autowired
    FeignService feignService;
    @Autowired
    UserDao userDao;
    @Autowired
    UserMapper userMapper;
    @GetMapping("/select/{id}")
    public User selectById(@PathVariable("id")Integer id){
        User u=new User();
        u.setId(id);
        User user=userDao.selectById(u);
       user.setCountryName(feignService.select(user.getCountryId()).getCountryName());
       return user;

    }
    @PostMapping("/insert")
    public String insert(User user)
    {
        if(userMapper.insertSelective(user)!=0)
        {
            return "插入成功";
        }
        else
        {
            return "插入失败";
        }
    }
    @PostMapping("/incountry")
    public String incountry(Country country)
    {
        return feignService.insert(country);
    }

}

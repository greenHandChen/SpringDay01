package com.user.userservice.controller;

import com.user.userservice.mapper.UserMapper;
import com.user.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 查找User的控制类
 * @author: xueWu.Chen
 * @create: 2019-07-26
 **/
@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /*
        对外暴露接口  "/user/byName" 通过姓名查找User信息
     */
    @RequestMapping(value = "/user/byName")
    public String getUserByName(@RequestParam("name")String name){
        User user = userMapper.findUserByName(name);
        if(user!=null){
            return user.toString();
        }else{
            return "对不起，没有找到相关信息";
        }
    }

    /*
        对外暴露接口，删除数据
     */
    @RequestMapping("/user/delUser")
    public String delUserInfoByName(@RequestParam("name")String name){
        if (userMapper.findUserIsDel(name) != 1) {//未删除
            //执行逻辑删除
            User user = userMapper.findUserByName(name);
            userMapper.deleteUserInfoByName(name);
            return "数据："+user.toString()+" 已删除";
        }
        return "对不起，您要删除的数据已经不存在";
    }

    /*
        对外暴露接口，插入数据
     */
    @RequestMapping("/user/insertUser")
    public String insertUser(@RequestBody User user){
        if(user!=null) {
            userMapper.insertUserInfo(user);
            return user.toString()+"数据插入成功";
        }else{
            return "对不起，数据获取异常";
        }
    }

}

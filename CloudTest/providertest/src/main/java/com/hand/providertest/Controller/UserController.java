package com.hand.providertest.Controller;

import com.hand.providertest.Entity.User;
import com.hand.providertest.Mapper.UserMapper;
import com.netflix.client.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    //404
    @RequestMapping("/404")
    public String test404(){
        return "查询id不存在";
    }
    //查询所有用户信息
    @RequestMapping("/findAll")
    public List<User> findUserAll(){
        System.out.println("所有用户数据："+userMapper.findUserAll());
        return userMapper.findUserAll();
    }
    //根据条件查询信息
    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id, HttpServletResponse hhtp) throws IOException {
        System.out.println("用户数据："+userMapper.findUserById(id));
        if(userMapper.findUserId(id)==0){
            hhtp.sendRedirect("/user/404");
        }
        return userMapper.findUserById(id);
    }
    //增加用户
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(){
        User user=new User();
        user.setAddress("武汉");
        user.setSex(2);
        user.setUsername("ceshi");
        Integer integer = userMapper.addUser(user);
        if(integer!=0){
            return "add OK";
        }else {
            return "add false";
        }

    }
    //根据id修改用户信息
    @RequestMapping(value = "/updateUserById/{id}",method = RequestMethod.GET)
    public String updateUserById(@PathVariable("id") Integer id){
        User user=new User();
        user.setId(id);
        user.setUsername("changer");
        user.setAddress("wuhan2");
        user.setSex(1);
        Integer gege=userMapper.updateUserById(user);
        if(gege!=0){
            return "update OK";
        }else {
            return "update false";
        }
    }
    //根据id删除用户数据
    @RequestMapping(value = "/deleteUserById/{id}",method = RequestMethod.GET)
    public String deleteUserById(@PathVariable("id") Integer id){
        Integer gege=userMapper.deleteUserById(id);
        if(gege!=0){
            return "delete OK";
        }else {
            return "delete false";
        }
    }
}

package com.example.springbootdemo;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.schedulerTesk.SchedulerTesK1;
import com.example.springbootdemo.schedulerTesk.SchedulerTesk2;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloWord {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWord(@RequestParam String name){
        String str="helloword"+name;
        return str;

    }
    @RequestMapping("/query")
    public List<User> query(){
        List<User> users = userService.queryUserInfo();
        return users;
    }
    @RequestMapping("/testHtml")
    public ModelAndView testHtml(){
        ModelAndView md =new ModelAndView();
        List<User> users = userService.queryUserInfo();
        md.addObject("testList",users);
        md.setViewName("test");
        return md;
    }


}

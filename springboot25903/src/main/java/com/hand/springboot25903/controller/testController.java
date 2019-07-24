package com.hand.springboot25903.controller;

import com.hand.HelloSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

     @Autowired
     private HelloSpringBoot helloSpringBoot;

     @GetMapping("/helloSpringBoot")
     @ResponseBody
     public String hellobootspring(){
          helloSpringBoot.sayHello();
          return "成功";
     }
}

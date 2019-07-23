package com.hand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
     @Autowired
     private HelloSpringBoot helloSpringBoot;
     @GetMapping("/helloSpringBoot")
     public void hellobootspring(){
          helloSpringBoot.sayHello;
     }
}

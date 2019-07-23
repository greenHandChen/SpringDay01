package com.hand;

import com.hand.service.HelloBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Autowired
    private HelloBootService helloBootService;

    @RequestMapping("helloSpringBoot")
    @ResponseBody
    public String sayBoot(){
        return helloBootService.sayHello();
    }
}

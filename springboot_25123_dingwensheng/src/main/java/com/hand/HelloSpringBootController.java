package com.hand;

import HelloWorld.HelloSpringbootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2320:29
 */
@Controller
public class HelloSpringBootController {
    @Autowired
    private HelloSpringbootService helloSpringbootService;

    @RequestMapping("/helloSpringboot")
    @ResponseBody
    public String index(){
        return helloSpringbootService.sayHello();
    }

}

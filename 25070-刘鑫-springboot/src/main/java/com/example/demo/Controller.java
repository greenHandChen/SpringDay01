package com.example.demo;

import com.lx.helloworld.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private PersonService personService;

    @RequestMapping("/helloSpringBoot")
    public String say(){
        return personService.sayHello();
    }
}

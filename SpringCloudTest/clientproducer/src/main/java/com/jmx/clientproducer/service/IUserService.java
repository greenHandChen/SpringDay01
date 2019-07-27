package com.jmx.clientproducer.service;

import org.springframework.web.bind.annotation.RequestMapping;


public interface IUserService {
       @RequestMapping("/test")
       public String test();
}

package com.springcloud.eurekaconsumerfeign.controller;

import com.springcloud.eurekaconsumerfeign.bean.User;
import com.springcloud.eurekaconsumerfeign.feign.ClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CRUDController {

    @Autowired
    private ClientFeign clientFeign;

    @GetMapping("/sel/{id}")
    public Map<String, Object> select(@PathVariable("id") Integer id) {
        return clientFeign.select(id);
    }

    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") Integer id) {
        clientFeign.delete(id);
        return "delete success";
    }

    @PostMapping(value = "/upd")
    public String update(User user) {
        System.out.println("feign controller:"+user);
        clientFeign.update(user);
        return "update success";
    }

    @PostMapping(value = "/add")
    public String add(User user) {
        System.out.println("feign controller:"+user);
        clientFeign.add(user);
        return "add success";
    }

}

package com.example.ext_server.controller;

import com.example.ext_server.po.Ext;
import com.example.ext_server.service.ExtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ext")
public class ExtController {
    @Autowired
    private ExtServiceImpl extService;

    @RequestMapping("/add")
    public String add(@RequestBody Ext ext) {
        return String.valueOf(extService.insert(ext));
    }

    @RequestMapping("/del")
    public String del(@RequestBody int[] ids) {
        return String.valueOf(extService.del(ids));
    }

    @RequestMapping("/sel")
    public String select(@RequestBody Ext ext){
        return String.valueOf(extService.select(ext));
    }

    @RequestMapping("/update")
    public String update(@RequestBody Ext ext){
        return String.valueOf(extService.update(ext));
    }

}

package club.osai.userservice.controller;

import club.osai.userservice.po.Other;
import club.osai.userservice.po.ResponseStatus;
import club.osai.userservice.po.User;
import club.osai.userservice.service.OtherService;
import club.osai.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserController.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    @Autowired
    OtherService otherService;

    @GetMapping("/{id}/user")
    public ResponseStatus find(@PathVariable("id") Long id) {
        return otherService.get(id);
    }

//    @PostMapping
//    public ResponseStatus add(@RequestBody Other other) {
//        return otherService.add(other);
//    }

    @DeleteMapping("/{id}")
    public ResponseStatus delete(@PathVariable("id") Long id) {
        return otherService.delete(id);
    }

    @DeleteMapping
    public ResponseStatus list() {

        return otherService.list();
    }

    @PutMapping
    public ResponseStatus update(@RequestBody Other other) {

        return otherService.update(other);
    }

}

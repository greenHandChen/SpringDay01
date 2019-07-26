package club.osai.userservice.controller;

import club.osai.userservice.po.ResponseStatus;
import club.osai.userservice.po.Other;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    OtherService otherService;

    @GetMapping
    public ResponseStatus list() {

        List<User> list = userService.list();
        return ResponseStatus.builder().msg("成功").status(200).object(list).build();
    }


    @GetMapping("{id}")
    public ResponseStatus findById(@PathVariable("id") Long id) {
        User byId = userService.getById(id);
        return ResponseStatus.builder().msg("成功").status(200).object(byId).build();

    }

    @PostMapping
    public ResponseStatus add(@RequestBody User user) {
        userService.add(user);
        return ResponseStatus.builder().status(200).msg("成功").build();
    }

    @DeleteMapping
    public ResponseStatus delete(@RequestBody User user) {
        userService.delete(user);
        return ResponseStatus.builder().status(200).msg("成功").build();
    }

    @GetMapping("/search")
    public ResponseStatus findBynName(@RequestParam(name = "name") String name) {

        User byName = userService.getByName(name);
        return ResponseStatus.builder().status(200).msg("成功").object(byName).build();

    }


    @GetMapping("/{id}/other")
    public ResponseStatus find(@PathVariable("id") Long id) {
        return otherService.get(id);
    }

}

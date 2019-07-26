package club.osai.other.controller;

import club.osai.other.po.Other;
import club.osai.other.po.ResponseStatus;
import club.osai.other.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OtherController.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@RestController
@RequestMapping("/other")
public class OtherController {
    @Autowired
    OtherService otherService;

    @GetMapping
    public ResponseStatus list() {

        List<Other> all = otherService.findAll();
        return ResponseStatus.builder().status(200).object(all).msg("成功").build();
    }

    @GetMapping("/{id}")
    public ResponseStatus get(@PathVariable("id") Long userId) {

        Other byUserId = otherService.findByUserId(userId);

        return ResponseStatus.builder().msg("成功").object(byUserId).status(200).build();
    }

    @PostMapping
    public ResponseStatus add(@RequestBody Other other) {
        Other add = otherService.add(other);

        return ResponseStatus.builder().msg("成功").object(add).status(200).build();
    }

    @DeleteMapping("/{id}")
    public ResponseStatus delete(@PathVariable("id") Long id) {
        otherService.delete(id);
        return ResponseStatus.builder().msg("成功").status(200).build();
    }

    @PutMapping
    public ResponseStatus update(@RequestBody Other other) {
        Other update = otherService.update(other);
        return ResponseStatus.builder().status(200).object(update).msg("成功").build();

    }
}

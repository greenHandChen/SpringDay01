package club.osai.userservice.service;

import club.osai.userservice.po.Other;
import club.osai.userservice.po.ResponseStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserService.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@FeignClient("other-service")
@RequestMapping("/other")
public interface OtherService {


    @GetMapping
    ResponseStatus list();

    @GetMapping("/{id}")
    ResponseStatus get(@PathVariable("id") Long userId);

    @PostMapping
    ResponseStatus add(@RequestBody Other other);


    @DeleteMapping("/{id}")
    ResponseStatus delete(@PathVariable("id") Long id);

    @PutMapping
    ResponseStatus update(@RequestBody Other other);
}

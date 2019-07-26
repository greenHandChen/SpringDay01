package club.osai.userservice.service;

import club.osai.userservice.po.Other;
import club.osai.userservice.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserService.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
public interface UserService {

    void add(User user);

    void delete(User user);

    User getById(Long id);

    User getByName(String name);

    List<User> getByNameLike(String name);


    List<User> list();


}

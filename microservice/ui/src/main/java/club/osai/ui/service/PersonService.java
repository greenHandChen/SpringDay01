package club.osai.ui.service;

import club.osai.ui.po.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: PersonService.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */
@FeignClient("person")
public interface PersonService {
    @RequestMapping(value = "/u")
    List<Person> findPerson(@RequestParam String name);
}

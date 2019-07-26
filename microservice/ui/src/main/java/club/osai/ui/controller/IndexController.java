package club.osai.ui.controller;

import club.osai.ui.po.Person;
import club.osai.ui.service.PersonHystrixService;
import club.osai.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: IndexController.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @Autowired
    PersonHystrixService personHystrixService;
    @Autowired
    SomeHystrixService someHystrixService;

    @RequestMapping("/u")
    public List<Person> person(@RequestParam String name) {
        System.out.println("---------person----------------");
        return personHystrixService.findPerson(name);
//        return null;
    }

    @RequestMapping("/getsome")
    public String getSome() {
//        System.out.println("---------getsome----------------");

        return someHystrixService.getSome();
    }
}

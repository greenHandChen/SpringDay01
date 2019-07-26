package club.osai.person.controller;

import club.osai.person.dao.PersonRepository;
import club.osai.person.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: PersonController.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/u")
    public List<Person> findPerson(String name) {
        System.out.println("====name=====:" + name);

        return personRepository.findByNameLike("%" + name + "%");
    }

}

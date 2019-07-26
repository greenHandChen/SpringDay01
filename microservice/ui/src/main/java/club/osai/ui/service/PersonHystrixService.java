package club.osai.ui.service;

import club.osai.ui.po.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: PersonHystrixService.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */

@Service
public class PersonHystrixService {
    @Autowired
    private PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackPerson")

    public List<Person> findPerson(String name) {
        return personService.findPerson(name);
    }

    public List<Person> fallbackPerson(String name) {
        List<Person> list = new ArrayList<>();
        Person p = new Person();
        p.setName("Person Service 故障");
        list.add(p);
        return list;
    }

}

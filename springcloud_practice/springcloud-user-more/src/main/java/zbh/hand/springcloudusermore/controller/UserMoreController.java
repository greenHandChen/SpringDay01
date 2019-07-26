package zbh.hand.springcloudusermore.controller;

import entity.UserMore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zbh.hand.springcloudusermore.service.UserMoreService;

/**
 * @author: wuhui
 * @time: 2019/7/26 11:31
 * @desc:
 */
@RestController
public class UserMoreController {

    @Autowired
    UserMoreService service;

    @PostMapping("/userMore")
    public void addUserMore(@RequestBody UserMore UserMore){
        service.addUserMore(UserMore);
    }
    @DeleteMapping(value = "/userMore/{id}")
    public void deleteUserMoreById(@PathVariable("id") Integer id){
        service.deleteUserMoreById(id);
    }
    @PutMapping(value = "/userMore")
    //fdbfdv
    public void deleteUserMoreById(@RequestBody UserMore UserMore){
        service.updateUserMore(UserMore);
    }
    @GetMapping(value = "/userMore/{id}")
    public UserMore selectUserMoreById(@PathVariable("id") Integer id){
        return  service.selectUserMoreById(id);
    }
}

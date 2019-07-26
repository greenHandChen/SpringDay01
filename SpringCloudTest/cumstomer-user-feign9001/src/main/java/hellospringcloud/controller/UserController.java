package hellospringcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springcloudtest.entities.User;
import springcloudtest.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Description restful 风格 listUser
     * @Author  ChenWeixong
     * @Date   2019/7/25 15:57
     * @Param
     * @Return
     * @Exception
     * */
    @RequestMapping(value = "/consumer/user/list",method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.listUsers();
    }


    @RequestMapping(value = "/consumer/user/get/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        return this.userService.getUserById(id);
    }

}

package springcloudtest.controller;

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
     * @Description  listUser
     * @Author  ChenWeixong
     * @Date   2019/7/26 17:04
     * @Param
     * @Return
     * @Exception
     * */
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> listUser(){
        return this.userService.listUsers();
    }




    /**
     * @Description  getUser
     * @Author  ChenWeixong
     * @Date   2019/7/26 17:05
     * @Param
     * @Return
     * @Exception
     * */
    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        return this.userService.getUserById(id);
    }
}

package com.hand.handuserdetail.userdetail.controller;

import com.hand.handuserdetail.userdetail.entity.UserDetail;
import com.hand.handuserdetail.userdetail.service.IUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwy
 * @version V1.0
 * @program: spring-cloud-exercise
 * @Description: TODO
 * @date 2019/7/26 14:59
 */
//@RequestMapping("/userdetail")
@RestController
public class UserDetailController {

    @Autowired
    private IUserDetailService userDetailServiceImpl ;

    @GetMapping("/hello2")
    public String hello2(){
        return "helloUserDetail";
    }


    @GetMapping("/find/{userId}")
    public UserDetail findUserDetailByUserId(@PathVariable Long userId){
        return userDetailServiceImpl.findUserDetailById(userId);
    }

    @GetMapping("/del/{id}")
    public String delUserDetail(@PathVariable Long id){
        Long flag = userDetailServiceImpl.delUserDetailByUserId(id);
        if(flag > 0){
            return "delete user detail success";
        }else{
            return "delete user detail fail";
        }
    }

    @GetMapping("/adduserdetail")
    public String addUserDetail(UserDetail userDetail){
        Long flag = userDetailServiceImpl.addUserDetail(userDetail);
        if(flag > 0){
            return "add user detail success";
        }else{
            return "add user detail fail";
        }
    }

}
